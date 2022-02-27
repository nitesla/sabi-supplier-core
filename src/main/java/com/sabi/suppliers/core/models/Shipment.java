package com.sabi.suppliers.core.models;

import com.sabi.framework.models.CoreEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper=false)
@Data
@Entity
public class Shipment extends CoreEntity {

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
    private String driverName;
    private String partnerName;
    private String partnerId;
    private String assestName;
    private String assestId;
    private String feedStatus;
    private String shipmentReferenceNumber;
}
