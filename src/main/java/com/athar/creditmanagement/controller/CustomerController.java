package com.athar.creditmanagement.controller;



import com.athar.creditmanagement.entity.Customer;
import com.athar.creditmanagement.request.customer.CreateCustomerRequest;
import com.athar.creditmanagement.request.customer.UpdateCustomerRequest;
import com.athar.creditmanagement.service.CustomerService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customer")
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/getall")
    public List<Customer> getAll(){

        return customerService.getAll();
    }

    @GetMapping("/getbyid/{id}")
    public Customer getById(@PathVariable String id) {
        return customerService.getById(id);
    }

    @PostMapping("/add")
    public void add(@RequestBody CreateCustomerRequest createCustomerRequest)  {
        customerService.add(createCustomerRequest);
    }

    @PutMapping("/update/{id}")
    public void update(@RequestBody UpdateCustomerRequest updateCustomerRequest, @PathVariable String id)  {

        customerService.update(updateCustomerRequest,id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable String id) {
        customerService.delete(id);

    }



}