package com.sabi.suppliers.core.models;

import com.sabi.framework.models.CoreEntity;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Transient;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
public class SupplyRequest extends CoreEntity {
    private Long productId;
    private String productName;
    private Long askingQuantity;
    private BigDecimal askingPrice;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String  referenceNo;
    private String status;
    private Long quantity;
    private BigDecimal price;
    private Long warehouseId;
    private String dropOffAddress;
    private Date dateAccepted;
    private Long askedQuantity;
    private Long askedPrice;
    private LocalDateTime deliveryDate;
    private String deliveryAddress;
    private String email;
    private String phone;
    private String customerName;
    private String rejectReason;
    private String deliveryStatus;
    private double productWeight;
    private Long supplierId;
    private String expiryTime;
    @Lob
    private String productImage;
    private Boolean unassigned;
    @Transient
    private String supplierName;

}
