package com.sabi.suppliers.core.dto.response;

import net.sourceforge.jtds.jdbc.DateTime;

import java.time.LocalDateTime;

public class ShipmentResponseDto {

    private Long id;
    private Long warehouseId;
    private DateTime DeliveryDate;
    private Long logisticPartnerId;
    private String logisticPartnerName;
    private String phoneNumber;
    private String vehicle;
    private String status;
    private double quantity;
    private double totalAmount;
    private DateTime expectedDeliveryDate;
    private DateTime startTime;
    private DateTime endTime;
    private LocalDateTime createdDate;

    private LocalDateTime updatedDate;

    private Long createdBy;

    private Long updatedBy;
}
