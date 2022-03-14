package com.sabi.suppliers.core.models.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.math.BigDecimal;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DashboardProductResponse {

    private String name;
    private BigDecimal price;
    private Long productId;
    private String productImage;
}
