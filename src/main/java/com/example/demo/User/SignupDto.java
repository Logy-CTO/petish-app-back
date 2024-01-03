package com.example.demo.User;

import com.sun.istack.NotNull;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class SignupDto {
    private Long user_id;
    @NotNull
    private String phone_number;
    private String user_name;
    private String bank_name;
    private String account_number;
    private String real_name;

    @Builder
    public SignupDto(
            Long user_id,
            String phone_number,
            String user_name,
            String bank_name,
            String account_number,
            String real_name
    )
    {
        this.user_id = user_id;
        this.phone_number = phone_number;
        this.user_name = user_name;
        this.bank_name = bank_name;
        this.account_number = account_number;
        this.real_name = real_name;
    }
}