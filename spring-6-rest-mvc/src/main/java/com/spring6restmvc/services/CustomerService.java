package com.spring6restmvc.services;

import java.util.List;
import java.util.UUID;

import com.spring6restmvc.model.Customer;

public interface CustomerService {

    List<Customer> getAllCustomers();

    Customer getCustomerById(UUID id);

    Customer saveNewCustomer(Customer customer);

    void updateCustomerById(UUID id, Customer customer);
}
