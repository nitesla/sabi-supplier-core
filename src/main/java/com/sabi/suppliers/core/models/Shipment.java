package com.sabi.suppliers.core.models;

import com.sabi.framework.models.CoreEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import net.sourceforge.jtds.jdbc.DateTime;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper=false)
@Data
@Entity
public class Shipment extends CoreEntity {

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
