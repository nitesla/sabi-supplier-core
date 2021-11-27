package com.sabisupplierscore.dto.response;

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
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Long createdBy;
    private Long updatedBy;
    private Boolean isActive;
}
