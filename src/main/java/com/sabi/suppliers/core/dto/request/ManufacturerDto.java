package com.sabi.suppliers.core.dto.request;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
public class ManufacturerDto {

    private Long id;
//    @NotBlank(message = "Name can not be empty")
    private String name;
//    @NotBlank(message = "stateID can not be empty")
    private Long stateID;
//    @NotNull(message = "address can not be empty")
    private String address;
//    @NotNull(message = "phone can not be empty")
    private String phone;
    @Email(message = "please enter a valid email address")
//    @NotNull(message = "email can not be empty")
    private String email;
//    @NotNull(message = "website can not be empty")
    private String website;
}
