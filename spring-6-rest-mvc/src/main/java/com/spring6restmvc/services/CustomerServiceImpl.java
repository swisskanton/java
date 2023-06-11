package com.spring6restmvc.services;

import com.spring6restmvc.model.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.time.LocalDateTime;
import java.util.*;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

    private Map<UUID, Customer> customerMap;

    public CustomerServiceImpl() {
        this.customerMap = new HashMap<>();

        Customer bob = Customer.builder()
                .id(UUID.randomUUID())
                .customerName("Bob Daniel")
                .version(1)
                .createdDate(LocalDateTime.now())
                .lastModifiedDate(LocalDateTime.now())
                .build();

        Customer carl = Customer.builder()
                .id(UUID.randomUUID())
                .customerName("Carl Logan")
                .version(1)
                .createdDate(LocalDateTime.now())
                .lastModifiedDate(LocalDateTime.now())
                .build();

        Customer dan = Customer.builder()
                .id(UUID.randomUUID())
                .customerName("Dan Amarson")
                .version(1)
                .createdDate(LocalDateTime.now())
                .lastModifiedDate(LocalDateTime.now())
                .build();

        customerMap.put(bob.getId(), bob);
        customerMap.put(carl.getId(), carl);
        customerMap.put(dan.getId(), dan);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return new ArrayList<>(customerMap.values());
    }

    @Override
    public Customer getCustomerById(UUID id) {
        return customerMap.get(id);
    }

    @Override
    public Customer saveNewCustomer(Customer customer) {
        Customer savedCustomer = Customer.builder()
                .id(UUID.randomUUID())
                .customerName(customer.getCustomerName())
                .version(customer.getVersion())
                .createdDate(LocalDateTime.now())
                .lastModifiedDate(LocalDateTime.now())
                .build();

        customerMap.put(savedCustomer.getId(), savedCustomer);
        log.debug("Customer " + savedCustomer.getCustomerName() + " saved");
        return savedCustomer;
    }

    @Override
    public void updateCustomerById(UUID customerId, Customer customer) {
        Customer existing = customerMap.get(customerId);
        existing.setCustomerName(customer.getCustomerName());
        existing.setVersion(customer.getVersion());
        existing.setLastModifiedDate(LocalDateTime.now());
        //customerMap.put(existing.getId(), existing);
        log.debug("Customer " + existing.getCustomerName() + " updated");
    }

    @Override
    public void deleteCustomerById(UUID customerId) {
        customerMap.remove(customerId);
        log.debug("Deleted customer by id " + customerId);
    }

    @Override
    public void updateCustomerPatchById(UUID customerId, Customer customer) {
        Customer existing = customerMap.get(customerId);

        if (StringUtils.hasText(customer.getCustomerName())) {
            existing.setCustomerName(customer.getCustomerName());
        }
        if (customer.getVersion() != null) {
            existing.setVersion(customer.getVersion());
        }
        existing.setLastModifiedDate(LocalDateTime.now());
        log.debug("Customer updated");
    }
}
