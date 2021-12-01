package com.sabi.suppliers.core.dto.request;

import lombok.Data;
import net.sourceforge.jtds.jdbc.DateTime;

import java.time.LocalDateTime;

@Data

public class ShipmentDto {

    private Long id;
    private Long warehouseId;
    private LocalDateTime DeliveryDate;
    private Long logisticPartnerId;
    private String logisticPartnerName;
    private String phoneNumber;
    private String vehicle;
    private String status;
    private double quantity;
    private double totalAmount;
    private LocalDateTime expectedDeliveryDate;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

}
