package com.sabi.suppliers.core.dto.request;

import lombok.Data;
import net.sourceforge.jtds.jdbc.DateTime;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data

public class ShipmentDto {

    private Long id;
    private Long warehouseId;
    private LocalDateTime deliveryDate;
    private Long logisticPartnerId;
    private String logisticPartnerName;
    private String phoneNumber;
    private String vehicle;
    private String status;
    private Double quantity;
    private BigDecimal totalAmount;
    private LocalDateTime expectedDeliveryDate;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

}
