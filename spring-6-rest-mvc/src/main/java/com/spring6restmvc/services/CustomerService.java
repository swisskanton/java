package com.spring6restmvc.services;

import java.util.List;
import java.util.UUID;

import com.spring6restmvc.model.Customer;

public interface CustomerService {

    List<Customer> getAllCustomers();

    Customer getCustomerById(UUID id);

    Customer saveNewCustomer(Customer customer);

    void updateCustomerById(UUID customerId, Customer customer);

    void deleteCustomerById(UUID customerId);

    void updateCustomerPatchById(UUID customerId, Customer customer);
}
