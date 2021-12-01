package com.sabi.suppliers.core.dto.request;


import lombok.Data;



@Data
public class SupplierSignUpRequestDto {


    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String name;
    private String password;
    private Long roleId;
}
