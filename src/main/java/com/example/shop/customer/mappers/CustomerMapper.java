package com.example.shop.customer.mappers;

import com.example.shop.customer.entities.Customer;
import com.example.shop.customer.model.dto.CustomerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface CustomerMapper {
    Customer customerDtoToCustomer(CustomerDTO customerDTO);
    CustomerDTO customerToCustomerDto(Customer customer);
}
