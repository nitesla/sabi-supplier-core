package com.sabi.suppliers.core.models.response;

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
    private int acceptedQuality;
    private BigDecimal price;
    private String status;
    private LocalDateTime deliveryDate;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Long createdBy;
    private Long updatedBy;

}
