package com.example.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/**
 * TO JEST KATEGORIA
 */

@Getter
@Setter
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "customers")
public class Customer implements Comparable<Customer>{

    @Id
    //@GeneratedValue(generator = "UUID")
    private UUID id;

    @Version
    private Integer version;

    private String name;
    private int age;

    @OneToMany(mappedBy = "customers")
    private List<Order> orders;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer customer)) return false;

        if (getAge() != customer.getAge()) return false;
        if (getId() != null ? !getId().equals(customer.getId()) : customer.getId() != null) return false;
        if (getVersion() != null ? !getVersion().equals(customer.getVersion()) : customer.getVersion() != null)
            return false;
        return getName() != null ? getName().equals(customer.getName()) : customer.getName() == null;
    }

    @Override
    public int hashCode() {
        int result = getId() != null ? getId().hashCode() : 0;
        result = 31 * result + (getVersion() != null ? getVersion().hashCode() : 0);
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        result = 31 * result + getAge();
        return result;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", version=" + version +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    @Override
    public int compareTo(Customer otherCustomer) {
        return Comparator.comparing(Customer::getName)
                .thenComparing(Customer::getAge)
                .compare(this,otherCustomer);
    }
}