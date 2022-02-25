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
public class ExternalDetailsResponse {


    private Long partnerId;
    private Long supplierId;
    private String name;
    private Long lgaId;
    private String lgaName;
    private String address;
    private String phone;
    private boolean isRegistered;
    private String cac;
    private int employeeCount;
    private String email;
    private String webSite;
    private String registrationDate;
    private String createdDate;
    private String updatedDate;
    private Long createdBy;
    private Long updatedBy;
    private Boolean isActive;
    private String firstName;
    private String lastName;
    private String userEmail;
    private String userPhone;
    private String username;
    private Long userId;
}
