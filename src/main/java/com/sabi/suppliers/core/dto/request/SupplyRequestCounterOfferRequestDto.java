package com.sabi.suppliers.core.dto.request;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class SupplyRequestCounterOfferRequestDto {

    private Long id;
    private Long supplyRequestId;
    private Long userId;
    private BigDecimal price;
    private Integer quantity;
}
