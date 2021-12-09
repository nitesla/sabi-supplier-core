package com.sabi.suppliers.core.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class WareHouseRequest {
    private Long id;
    @NotNull(message = "Product Id can not be blank")
    private Long productId;
    @NotNull(message = "Supplier ID is required")
    private Long supplierId;
    @NotNull(message = "State Id is required")
    private Long stateId;
    @NotBlank(message = "Address is required")
    private String address;
    @NotBlank(message = "Contact Person is required")
    private String contactPerson;
    @NotBlank(message = "Contact Phone is required")
    private String contactPhone;
    @Email(message = "Contact email should be of valid pattern")
    @NotBlank(message = "Contact email is required")
    private String contactEmail;
//    @NotBlank(message = "Contact email is required")
    private String longitude;
    private String latitude;
//    @NotNull(message = "Warehouse user id is required")
//    private Long warehouseUserId;
    @NotNull(message = "user id is required")
    private Long userId;
    @NotNull(message = "LGA id is required")
    private Long lgaId;
    @NotNull(message = "Product count is required")
    private Long productCount;
    @NotBlank(message = "Name is required")
    private String name;
//    @NotNull(message = "Product is required")
//    @DecimalMin(value = "0.0", message = "Product cost can not be  less than 0")
//    private BigDecimal productCost;
}
