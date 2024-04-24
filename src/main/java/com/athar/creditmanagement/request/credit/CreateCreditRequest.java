package com.athar.creditmanagement.request.credit;



import lombok.Data;
import org.bson.types.ObjectId;

@Data
public class CreateCreditRequest {
    private String id;
    private String result;
    private Integer limit;
    private String customerId;

}