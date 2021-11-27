package com.sabi.suppliers.core.dto.request;

import lombok.Data;

@Data
public class ProductDto {

    private Long id;
    private String name;
    private Long manufacturerId;
    private Long productCategoryId;
}
