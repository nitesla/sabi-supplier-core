package com.sabi.suppliers.core.dto.request;

import lombok.Data;

@Data
public class ProductCountDto {

    private Long id;
    private Long shipmentId;
    private Long productId;
    private String name;
    private Long quantity;
}
