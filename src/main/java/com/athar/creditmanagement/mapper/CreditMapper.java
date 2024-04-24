package com.athar.creditmanagement.mapper;

import com.athar.creditmanagement.entity.Credit;
import com.athar.creditmanagement.request.credit.CreateCreditRequest;
import com.athar.creditmanagement.request.credit.UpdateCreditRequest;
import com.athar.creditmanagement.response.CreditResultResponse;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel ="spring")
public interface CreditMapper {
    @Mapping(source = "customerId",target = "customer.id")
    Credit toCredit(CreateCreditRequest request);
    void update(@MappingTarget Credit credit, UpdateCreditRequest request);
    CreditResultResponse toCreditResultResponse(Credit credit);
}
