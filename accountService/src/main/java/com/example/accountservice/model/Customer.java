package com.example.accountservice.model;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class Customer {
    private Long id;
    private String firstName;
    private String lastname;
    private String email;
}
