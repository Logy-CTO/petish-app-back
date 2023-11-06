package com.example.demo.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class User {
    private String phone_number;

    @Id
    private String username;

    private String bank_name;
    private String account_number;
    private String real_name;
    private String Area;
}
