package com.athar.creditmanagement.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Document(collection = "credit")
public class Credit {
    @Id
    private String id;
    private String result;
    private Integer limit;
    @OneToOne(mappedBy = "credit", fetch = FetchType.LAZY)
    private Customer customer;
}