package com.sabi.suppliers.core.dto.response;


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
public class PartnerUserResponse {

    private Long id;
    private Long partnerId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String username;
    private String code;
    private String message;
}
