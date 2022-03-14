package com.sabi.suppliers.core.models.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.math.BigDecimal;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DashboardWarehouseResponse {

    private String warehouseName;
    private String productName;
    private BigDecimal price;
    private String productImage;
}
