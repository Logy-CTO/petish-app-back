package com.example.demo.User;

import lombok.*;
import org.apache.catalina.User;

@Getter
@Setter
@NoArgsConstructor
public class UserSignupDTO {

    private Long user_id;
    private String phone_number;
    private String user_name;
    private String bank_name;
    private String account_number;
    private String real_name;
    private String area_name;

    public UserEntity toEntity(){
        return UserEntity.builder()
                .user_id(user_id)
                .phone_number(phone_number)
                .user_name(user_name)
                .bank_name(bank_name)
                .account_number(account_number)
                .real_name(real_name)
                .area_name(area_name)
                .build();
    }

    @Builder
    public UserSignupDTO(
            Long user_id,
            String phone_number,
            String user_name,
            String bank_name,
            String account_number,
            String real_name,
            String area_name
    )
    {
      this.user_id = user_id;
      this.phone_number = phone_number;
      this.user_name = user_name;
      this.bank_name = bank_name;
      this.account_number = account_number;
      this.real_name = real_name;
      this.area_name = area_name;
    }
}
