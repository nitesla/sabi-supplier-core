package com.sabi.suppliers.core.models;

import com.sabi.framework.models.CoreEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import net.sourceforge.jtds.jdbc.DateTime;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper=false)
@Data
@Entity
public class Shipment extends CoreEntity {

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
