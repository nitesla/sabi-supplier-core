package com.sabi.suppliers.core.models.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WareHouseGoodResponseDto {

    private Long id;
    private Long warehouseId;
    private Long supplierGoodId;
    private int qtySold;
    private int qtyAvaliable;
    private double price;
    private int qty;
    private int availableStock;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Long createdBy;
    private Long updatedBy;
    private Long variantId;
    private Integer commitedStock;
    private Integer minimumOrderQuantity;
    private String variantName;
    private Boolean isActive;
    private String warehouseName;
}
