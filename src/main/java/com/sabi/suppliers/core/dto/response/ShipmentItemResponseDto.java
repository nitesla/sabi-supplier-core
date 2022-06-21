package com.sabi.suppliers.core.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ShipmentItemResponseDto {

    private Long id;
    private Long supplierRequestId;
    private Long shipmentId;
    private int quantity;
    private int acceptedQuantity;
    private BigDecimal price;
    private String status;
    private String deliveryAddress;
    private String email;
    private String phoneNumber;
    private String customerName;
    private LocalDateTime deliveryDate;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Long createdBy;
    private Long updatedBy;

}
