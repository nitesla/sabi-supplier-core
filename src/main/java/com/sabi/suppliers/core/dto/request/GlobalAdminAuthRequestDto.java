package com.sabi.suppliers.core.dto.request;

import lombok.Data;

@Data
public class GlobalAdminAuthRequestDto {

    private String authKey;
    private String userId;
    private String applicationCode;
}
