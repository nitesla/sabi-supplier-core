package com.sabi.suppliers.core.models.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SupplierDashbaordResponseDto {

    private int pendingOrder;
    private int completedOrder;
    private int cancelledOrder;
    private int ongoingDelivery;
    private double totalSales;
    private int warehouses;
    private int products;
    private double outstandingPayment;
    private Boolean isActive;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Long createdBy;
    private Long updatedBy;
}
