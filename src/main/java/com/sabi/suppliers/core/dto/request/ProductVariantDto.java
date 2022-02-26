package com.sabi.suppliers.core.dto.request;

import lombok.Data;

@Data
public class ProductVariantDto {

    private Long id;
    private String name;
    private Long productId;
    private String picture;
    private Integer rowPerPack;
    private Integer pieceaPerRow;
    private double price;
    private double leastPrice;
    private double maxPrice;
}
