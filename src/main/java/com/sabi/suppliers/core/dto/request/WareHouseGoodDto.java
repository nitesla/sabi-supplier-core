package com.sabi.suppliers.core.dto.request;

import lombok.Data;

@Data
public class WareHouseGoodDto {

    private Long id;
    private Long warehouseId;
    private Long supplierGoodId;
    private int qtySold;
    private int qtyAvaliable;
    private double price;
    private Integer commitedStock;
    private Integer avaliableStock;
    private String minimumOrderQuantity;
    private int qty;
}
