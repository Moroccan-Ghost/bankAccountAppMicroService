package com.example.accountservice.entities;

import com.example.accountservice.enums.AccountType;
import com.example.accountservice.model.Customer;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BankAccount {
    @Id
    private String accountId;
    private double balance;
    private LocalDate createdAt;
    private String currency;
    @Enumerated(EnumType.STRING)
    private AccountType type;
    @Transient //ignore this attribute && don't create DB (not jpa)
    private Customer customer;
    private Long customerID;
}
