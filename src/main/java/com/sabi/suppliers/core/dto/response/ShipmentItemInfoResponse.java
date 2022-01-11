package com.sabi.suppliers.core.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ShipmentItemInfoResponse {

    private Long id;
    private Long supplierRequestId;
    private Long shipmentId;
    private int quantity;
    private int acceptedQuality;
    private BigDecimal price;
    private String status;
    private LocalDateTime deliveryDate;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Long createdBy;
    private Long updatedBy;


    private Long warehouseId;
    private LocalDateTime shipmentDeliveryDate;
    private String logisticPartnerId;
    private String logisticPartnerName;
    private String phoneNumber;
    private String vehicle;
    private String shipmentsStatus;
    private Double shipmentQuantity;
    private BigDecimal totalAmount;
    private LocalDateTime expectedDeliveryDate;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private LocalDateTime shipment_createdDate;
    private LocalDateTime shipment_updatedDate;
    private Long shipment_createdBy;
    private Long shipment_updatedBy;
    private Boolean isActive;

    private Long productId;
    private String productName;
    private Long askingQuantity;
    private BigDecimal askingPrice;
    private Date supplyRequest_startTime;
    private Date supplyRequest_endTime;
    private String  referenceNo;
    private String supplyRequest_status;
    private Long supplyRequest_quantity;
    private BigDecimal supplyRequest_price;
    private Long supplyRequest_warehouseId;
    private String dropOffAddress;
    private Date dateAccepted;
    private Long askedQuantity;
    private Long askedPrice;
    private LocalDateTime supplyRequest_deliveryDate;
    private String deliveryAddress;
    private String email;
    private String phone;
    private String rejectReason;
}
