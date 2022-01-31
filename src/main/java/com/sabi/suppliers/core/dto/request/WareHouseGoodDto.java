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
    private int commitedStock;
    private int avaliableStock;
    private int qty;
}
