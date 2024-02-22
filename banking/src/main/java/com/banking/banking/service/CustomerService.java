package com.banking.banking.service;

import com.banking.banking.entity.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
    Customer find(long id);

    Customer save(Customer customer);

    Customer delete(long id);
}
