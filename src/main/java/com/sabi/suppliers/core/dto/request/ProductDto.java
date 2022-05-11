package com.sabi.suppliers.core.dto.request;

import lombok.Data;

@Data
public class ProductDto {

    private Long id;
    private String name;
    private double weight;
    private Long manufacturerId;
    private String image;
    private Long productCategoryId;
}
