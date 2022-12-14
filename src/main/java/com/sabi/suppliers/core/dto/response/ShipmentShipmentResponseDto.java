package com.sabi.suppliers.core.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ShipmentShipmentResponseDto {

    private Long id;
    private Long warehouseId;
    private String warehouseAddress;
    private LocalDateTime deliveryDate;
    private String logisticPartnerId;
    private String logisticPartnerName;
    private String phoneNumber;
    private String vehicle;
    private String status;
    private Double quantity;
    private BigDecimal totalAmount;
    private LocalDateTime expectedDeliveryDate;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String deliveryStatus;
    private String feedStatus;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Long createdBy;
    private Long updatedBy;
//    private String deliveryAddress;
//    private String email;
//    private String customerName;
    List<ShipmentItemResponseDto> shipmentItemResponseDtoList;
    List<ProductCountResponse> productCountResponseList;
}
