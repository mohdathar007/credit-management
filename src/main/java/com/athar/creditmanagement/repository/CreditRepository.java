package com.athar.creditmanagement.repository;

import com.athar.creditmanagement.entity.Credit;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditRepository extends MongoRepository<Credit,String> {
}
