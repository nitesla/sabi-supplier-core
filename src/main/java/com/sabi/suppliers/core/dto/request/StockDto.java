package com.sabi.suppliers.core.dto.request;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class StockDto {

    private Long id;
    private Long wareHouseGoodId;
    private LocalDateTime actionDate;
    private String action;
    private int initialQuantity;
    private int quantity;
    private int finalQuantity;
    private Long userId;
}
