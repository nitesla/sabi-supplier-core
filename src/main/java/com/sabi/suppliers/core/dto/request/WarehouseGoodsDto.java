package com.sabi.suppliers.core.dto.request;

import lombok.Data;

@Data
public class WarehouseGoodsDto {

    private Long id;
    private Long warehouseId;
    private Long supplyGoodId;
    private int qtySold;
    private int qtyAvaliable;
    private double price;
    private int qty;
}
