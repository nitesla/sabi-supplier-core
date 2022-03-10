package com.sabi.suppliers.core.models.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SupplierDashbaordResponseDto {

    private int pendingOrder;
    private int completedOrder;
    private int cancelledOrder;
    private int ongoingDelivery;
    private BigDecimal totalSales;
    private int warehouses;
    private int products;
    private BigDecimal outstandingPayment;
    private Boolean isActive;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Long createdBy;
    private Long updatedBy;
}
