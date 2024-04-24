package com.athar.creditmanagement.mapper;


import com.athar.creditmanagement.entity.Customer;
import com.athar.creditmanagement.request.customer.CreateCustomerRequest;
import com.athar.creditmanagement.request.customer.UpdateCustomerRequest;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel ="spring")
public interface CustomerMapper {
    Customer toCustomer(CreateCustomerRequest request);
    void update(@MappingTarget Customer customer, UpdateCustomerRequest request);




}