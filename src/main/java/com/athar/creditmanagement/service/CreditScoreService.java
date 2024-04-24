package com.athar.creditmanagement.service;



import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class CreditScoreService {
    private Random random = new Random();

    public int generateCreditScore() {
        return random.nextInt(1000);
    }
}