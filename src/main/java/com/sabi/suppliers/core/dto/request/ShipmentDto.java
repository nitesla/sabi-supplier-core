package com.sabi.suppliers.core.dto.request;

import lombok.Data;
import net.sourceforge.jtds.jdbc.DateTime;

@Data

public class ShipmentDto {

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

}
