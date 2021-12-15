package com.sabi.suppliers.core.dto.request;

import lombok.Data;

@Data
public class WarehouseGoodDto {

    private Long id;
    private Long warehouseId;
    private Long supplierGoodId;
    private int qtySold;
    private int qtyAvaliable;
    private int qty;
}
