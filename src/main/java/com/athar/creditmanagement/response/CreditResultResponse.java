package com.athar.creditmanagement.response;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreditResultResponse {
    private String result;
    private Integer limit;
}