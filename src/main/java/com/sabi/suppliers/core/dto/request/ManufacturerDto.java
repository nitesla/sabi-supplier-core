package com.sabi.suppliers.core.dto.request;

import lombok.Data;

@Data
public class ManufacturerDto {

    private Long id;
    private String name;
    private Long stateID;
    private String address;
    private String phone;
    private String email;
    private String website;
}
