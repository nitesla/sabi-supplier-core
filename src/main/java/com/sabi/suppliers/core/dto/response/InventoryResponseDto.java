package com.sabi.suppliers.core.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class InventoryResponseDto {

    private Long id;
    private Long supplierGoodId;
    private LocalDateTime deliveryDate;
    private String deliveryAddress;
    private String name;
    private Long warehouseId;
    private String Status;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Long createdBy;
    private Long updatedBy;
    private String wareHouseAddress;
    private Boolean isActive;
}
