package com.example.shop.customer.service.api;

import com.example.shop.customer.entities.Customer;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public interface CustomerService {
    Optional<Customer> find(UUID id);

    void create(Customer customer);

    void delete(UUID id);
}
