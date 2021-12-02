package com.sabi.suppliers.core.dto.request;

import lombok.Data;

@Data
public class SupplierUserDto {

    private Long id;
    private Long roleId;
    private String firstName;
    private String lastName;
    private String middleName;
    private String email;
    private String phone;
//    private String userType;
}
