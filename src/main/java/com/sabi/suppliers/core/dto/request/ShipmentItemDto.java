package com.sabi.suppliers.core.dto.request;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class ShipmentItemDto {

    private Long id;
    private Long supplierRequestId;
    private Long shipmentId;
    private int quantity;
    private int acceptedQuality;
    private BigDecimal price;
    private String status;
    private LocalDateTime deliveryDate;
}
