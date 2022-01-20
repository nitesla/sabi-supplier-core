package com.sabi.suppliers.core.dto.request;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class ShipmentShipmentItemDto {

    private Long id;
    private Long warehouseId;
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

    List<ShipmentItemDto> shipmentItemDtoList;
}
