package com.example.demo.User;

import lombok.Builder;
import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
@Table(name = "USER")

public class UserEntity {
    @Id
    //gerneratedVALUE SQL 시퀀스 사용 후 수정필요
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID")
    private Long user_id;

    @Column(name = "ACCOUNT_NUMBER")
    private String account_number;

    @Column(name = "Area")
    private String area;

    @Column(name = "BANK_NAME")
    private String bank_name;

    //후에 postEntity 생성 후 조인 수정 필요
    @Column(name = "INTEREST_POST")
    private Long interest_post;

    @Column(name = "PHONE_NUMBER")
    private String phone_number;

    @Column(name = "REAL_NAME")
    private String real_name;

    @Column(name = "USER_NAME")
    private String user_name;


    public UserSignupDTO toDTO(){
        return UserSignupDTO.builder()
                .user_id(user_id)
                .phone_number(phone_number)
                .user_name(user_name)
                .bank_name(bank_name)
                .account_number(account_number)
                .real_name(real_name)
                .area(area)
                .build();
    }

    @Builder
    public UserEntity(Long user_id,
                      String account_number,
                      String area,
                      String bank_name,
                      Long interest_post,
                      String phone_number,
                      String real_name,
                      String user_name)
    {
        this.user_id = user_id;
        this.account_number = account_number;
        this.bank_name = bank_name;
        this.interest_post = interest_post;
        this.phone_number = phone_number;
        this.real_name = real_name;
        this.user_name = user_name;
        this.area = area;
    }
}
