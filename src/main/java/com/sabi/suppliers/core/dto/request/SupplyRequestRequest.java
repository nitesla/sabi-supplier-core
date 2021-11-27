package com.sabi.suppliers.core.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class SupplyRequestRequest {

    private Long id;
    @NotNull(message = "Product ID is required")
    private Long productId;
    @NotBlank(message = "Product name is required")
    private String productName;
    @NotNull(message = "Asking Quantity is required")
    @Min(message = "Asking quantity can not be less than 1", value = 1L)
    private Long askingQuantity;
    @NotNull(message = "Asking price can not be null")
    @DecimalMin(value = "0.0", message = "Asking price can not be less than 0")
    private BigDecimal askingPrice;
    private Date startTime;
    private Date endTime;
    @NotBlank(message = "Reference Number is required")
    private String  referenceNo;
    @NotBlank(message = "Status is required ")
    private String status;
}
