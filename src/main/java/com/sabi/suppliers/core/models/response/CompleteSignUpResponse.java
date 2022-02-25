package com.sabi.suppliers.core.models.response;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CompleteSignUpResponse {

    private Long supplierId;
    private String name;
    private String address;
    private String phone;
    private String email;
    private LocalDateTime createdDate;
    private Long userId;
    private String userEmail;
    private String firstName;
    private String lastName;
    private String userPhone;
    private String userName;
}
