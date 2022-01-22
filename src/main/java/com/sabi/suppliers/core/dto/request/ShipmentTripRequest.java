package com.sabi.suppliers.core.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ShipmentTripRequest {

    private Long id;
    private String phoneNumber;
    private Long warehouseId;
    private Long logisticPartnerId;
    private LocalDateTime deliveryDate;
    private String status;
    private Long assestId;
    private BigDecimal totalAmount;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
}
