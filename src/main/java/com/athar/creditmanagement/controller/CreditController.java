package com.athar.creditmanagement.controller;



import com.athar.creditmanagement.entity.Credit;
import com.athar.creditmanagement.request.credit.CreateCreditRequest;
import com.athar.creditmanagement.request.credit.UpdateCreditRequest;
import com.athar.creditmanagement.response.CreditResultResponse;
import com.athar.creditmanagement.service.CreditService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/credit")
public class CreditController {
    private final CreditService creditService;

    public CreditController(CreditService creditService) {
        this.creditService = creditService;
    }
    @GetMapping("/getall")
    public List<Credit> getAll(){
        return creditService.getAll();
    }
    @GetMapping("/getbyid/{id}")
    public Credit getById(@PathVariable String id) {
        return creditService.getById(id);
    }
    @PostMapping("/add")
    public void add(@RequestBody CreateCreditRequest createCreditRequest)  {
        creditService.add(createCreditRequest);
    }
    @PutMapping("/update/{id}")
    public void update(@RequestBody UpdateCreditRequest updateCreditRequest, @PathVariable String id)  {
        creditService.update(updateCreditRequest,id);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable String id) {
        creditService.delete(id);

    }
    @GetMapping("/getResult/{id}")
    public CreditResultResponse getResult(@PathVariable String id){
        return creditService.getResult(id);
    }

}
