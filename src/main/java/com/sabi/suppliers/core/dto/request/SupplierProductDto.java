package com.sabi.suppliers.core.dto.request;

import lombok.Data;

@Data
public class SupplierProductDto {

    private Long id;
    private Long supplierId;
    private  Long productId;

}
