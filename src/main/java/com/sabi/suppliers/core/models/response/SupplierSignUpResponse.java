package com.sabi.suppliers.core.models.response;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SupplierSignUpResponse {


    private Long id;
    private Long supplierId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String name;
    private String username;
}
