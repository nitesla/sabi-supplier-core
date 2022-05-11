package com.sabi.suppliers.core.models.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class SupplyRequestResponse {
    private Long id;
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
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Long createdBy;
    private Long updatedBy;
    private Boolean isActive;
    private LocalDateTime deliveryDate;
    private String deliveryAddress;
    private String email;
    private String phone;
    private String rejectReason;
    private String deliveryStatus;
    private String productWeight;
    private Long supplierId;
    private LocalDateTime expireTime;
    private String productImage;
}
