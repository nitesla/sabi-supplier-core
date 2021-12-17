package com.sabi.suppliers.core.models;

import com.sabi.framework.models.CoreEntity;
import lombok.*;

import javax.persistence.Entity;
import java.math.BigDecimal;
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
    private Date startTime;
    private Date endTime;
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
    private String rejectReason;
}
