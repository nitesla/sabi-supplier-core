package com.sabi.suppliers.core.models;

import com.sabi.framework.models.CoreEntity;
import com.sabi.suppliers.core.dto.response.ProductCountResponse;
import com.sabi.suppliers.core.dto.response.ShipmentItemResponseDto;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Transient;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@EqualsAndHashCode(callSuper=false)
@Data
@Entity
public class Shipment extends CoreEntity {

    private Long warehouseId;
    private String warehouseAddress;
    private LocalDateTime deliveryDate;
    private String logisticPartnerId;
    private String logisticPartnerName;
    private String phoneNumber;
    private String vehicle;
    private String status;
    private Double quantity;
    private BigDecimal totalAmount;
    private LocalDateTime expectedDeliveryDate;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String driverName;
    private String partnerName;
    private String partnerId;
    private String assestName;
    private String assestId;
    private String feedStatus;
    private String shipmentReferenceNumber;
    private String paymentStatus;

    @Transient
    List<ShipmentItemResponseDto> shipmentItemResponseDtoList;
    @Transient
    List<ProductCountResponse> productCountResponseList;
}
