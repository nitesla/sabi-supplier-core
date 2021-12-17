package com.sabi.suppliers.core.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class SupplyRequestRequest {

    private Long id;
    @NotNull(message = "Product ID is required")
    @Min(value = 1L, message = "Product Id can not be less than 1")
    private Long productId;
    @NotBlank(message = "Product name is required")
    private String productName;
    @NotNull(message = "Asking Quantity is required")
    @Min(message = "Asking quantity can not be less than 1", value = 1L)
    private Long askingQuantity;
    @NotNull(message = "Asking price can not be null")
    @DecimalMin(value = "0.0", message = "Asking price can not be less than 0")
    private BigDecimal askingPrice;
    @DateTimeFormat( pattern="yyyy-MM-dd")
    private Date startTime;
    @DateTimeFormat( pattern="yyyy-MM-dd")
    private Date endTime;
    @NotBlank(message = "Reference Number is required")
    private String  referenceNo;
    @NotBlank(message = "Status is required ")
    private String status;
    @NotNull(message = "Quantity is required")
    private Long quantity;
    @NotNull(message = "Price  is required")
    private BigDecimal price;
    private Long warehouseId;
    @NotBlank(message = "Drop off address is required")
    private String dropOffAddress;
    @NotNull(message = "Date Accepted is required")
    private Date dateAccepted;
    @NotNull(message = "Asked quantity is required")
    private Long askedQuantity;
    @NotNull(message = "Asked price can not be null")
    private Long askedPrice;
    private LocalDateTime deliveryDate;
    private String deliveryAddress;
    private String email;
    private String phone;
    private String rejectReason;
}
