package com.athar.creditmanagement.service;



import com.athar.creditmanagement.entity.Customer;
import com.athar.creditmanagement.exceptions.NotFoundException;
import com.athar.creditmanagement.mapper.CustomerMapper;
import com.athar.creditmanagement.repository.CustomerRepository;
import com.athar.creditmanagement.request.customer.CreateCustomerRequest;
import com.athar.creditmanagement.request.customer.UpdateCustomerRequest;

import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

public class CustomerService {
    CustomerRepository customerRepository;
    CustomerMapper mapper;
    CreditScoreService creditScoreService;


    public List<Customer> getAll() {
        List<Customer> customers=customerRepository.findAll();
        return customers;
    }

    public Customer getById(String id) {
        return customerRepository.findById(id).orElseThrow(() -> new NotFoundException("Customer"));
    }

    public void add(CreateCustomerRequest createCustomerRequest) {
        Customer customer=mapper.toCustomer(createCustomerRequest);
        customer.setCreditScore(creditScoreService.generateCreditScore());
        customerRepository.save(customer);

    }

    public void update(UpdateCustomerRequest updateCustomerRequest, String id) {
        Customer customer=customerRepository.findById(id).get();
        mapper.update(customer,updateCustomerRequest);
        customerRepository.save(customer);

    }

    public void delete(String id) {
        customerRepository.deleteById(id);

    }
}
