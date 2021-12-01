package com.sabi.suppliers.core.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SupplierGoodDto {

    private Long id;
    private Long supplierProductId;
    private Long variantId;
    private double price;
}
