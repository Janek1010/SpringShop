package com.example.shop.customer.services.impl;

import com.example.shop.customer.entities.Order;
import com.example.shop.customer.repositories.OrderRepository;
import com.example.shop.customer.services.api.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@Primary
@RequiredArgsConstructor
public class OrderServiceJPA implements OrderService {
    private final OrderRepository orderRepository;

    @Override
    public void saveNewOrder(Order order) {
        orderRepository.save(order);
    }

    @Override
    public List<Order> findAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public List<Order> findByCustomerName(String customerName) {
        return orderRepository.findByCustomer_Name(customerName);
    }


    @Override
    public void deleteOrderById(UUID uuid) {
        orderRepository.deleteById(uuid);
    }

    @Override
    public Optional<Order> findByCustomer_Pesel(String pesel) {
        return orderRepository.findByCustomer_Pesel(pesel);
    }

}