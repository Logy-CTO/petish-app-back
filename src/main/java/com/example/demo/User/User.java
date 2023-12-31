package com.example.demo.User;

import lombok.Builder;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "USER")

public class User {
    @Id
    //gerneratedVALUE SQL 시퀀스 사용 후 수정필요
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID")
    private Long user_id;

    @Column(name = "ACCOUNT_NUMBER")
    private String account_number;

    @Column(name = "AREA_NAME")
    private String area_name;

    @Column(name = "BANK_NAME")
    private String bank_name;

    //후에 postEntity 생성 후 조인 수정 필요
    @Column(name = "INTEREST_POST")
    private Long interest_post;

    @Column(name = "PHONE_NUMBER")
    private String phone;

    @Column(name = "REAL_NAME")
    private String real_name;

    @Column(name = "USER_NAME")
    private String user_name;


    @Builder
    public User(Long user_id,
                String account_number,
                String area_name,
                String bank_name,
                Long interest_post,
                String phone,
                String real_name,
                String user_name)
    {
        this.user_id = user_id;
        this.account_number = account_number;
        this.bank_name = bank_name;
        this.interest_post = interest_post;
        this.phone = phone;
        this.real_name = real_name;
        this.user_name = user_name;
        this.area_name = area_name;
    }

    public User() {

    }
}
