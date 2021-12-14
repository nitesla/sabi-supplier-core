package com.sabi.suppliers.core.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WarehouseGoodsResponseDto {

    private Long id;
    private Long warehouseId;
    private Long supplyGoodId;
    private int qtySold;
    private int qtyAvaliable;
    private int qty;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Long createdBy;
    private Long updatedBy;
    private Boolean isActive;
}
