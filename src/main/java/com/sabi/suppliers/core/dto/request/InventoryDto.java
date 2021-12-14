package com.sabi.suppliers.core.dto.request;

import lombok.Data;

import java.beans.Transient;
import java.time.LocalDateTime;

@Data
public class InventoryDto {

    private Long id;
    private Long supplierGoodId;
    private LocalDateTime deliveryDate;
    private String deliveryAddress;
    private String name;
    private Long warehouseId;
    private String Status;

    private String warehouseAddresses;
}
