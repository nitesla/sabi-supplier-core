package com.sabi.suppliers.core.dto.request;

import com.sabi.suppliers.core.models.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SupplierGoodDto {

    private Long id;
    private Long supplierId;
    private Long variantId;
    private double price;
    private int totalQuantityAvailable;
    private int quantitySold;
    private int quantity;
    private Integer committedStock;
    private String minimumOrderQuantity;
}
