package com.athar.creditmanagement.request.customer;



import lombok.Data;



import java.time.LocalDate;


@Data
public class CreateCustomerRequest {
    private String identityNumber;
    private String firstName;
    private String lastName;
    private Integer salary;
    private String phoneNumber;
    private LocalDate birthDate;
}