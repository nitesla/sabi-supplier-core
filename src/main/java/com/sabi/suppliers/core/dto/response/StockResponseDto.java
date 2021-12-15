package com.sabi.suppliers.core.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class StockResponseDto {

    private Long id;
    private Long wareHouseGoodId;
    private LocalDateTime actionDate;
    private String action;
    private int initialQuantity;
    private int quantity;
    private int finalQuantity;
    private Long userId;
    private Boolean isActive;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Long createdBy;
    private Long updatedBy;
}
