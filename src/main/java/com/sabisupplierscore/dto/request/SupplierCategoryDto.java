package com.sabisupplierscore.dto.request;

import lombok.Data;

@Data
public class SupplierCategoryDto {

    private Long id;
    private String name;
    private int creditPeriod;
}
