package com.sabi.suppliers.core.dto.request;

import lombok.Data;

@Data
public class SupplierUserDto {

    private Long id;
    private Long userId;
    private Long wareHouseId;
    private Long roleId;
}
