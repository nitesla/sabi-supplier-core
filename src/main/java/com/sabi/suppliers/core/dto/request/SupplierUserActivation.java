package com.sabi.suppliers.core.dto.request;


import lombok.Data;

@Data
public class SupplierUserActivation {

    private String email;
    private String activationUrl;
}
