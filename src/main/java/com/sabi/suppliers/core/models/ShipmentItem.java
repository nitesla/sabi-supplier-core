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
public class ShipmentItem extends CoreEntity {

    private Long supplierRequestId;
    private Long shipmentId;
    private int quantity;
    private int acceptedQuality;
    private BigDecimal price;
    private String status;
    private LocalDateTime deliveryDate;

}