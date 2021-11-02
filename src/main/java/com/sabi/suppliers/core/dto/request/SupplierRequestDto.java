package com.sabi.suppliers.core.dto.request;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

/**
 *
 * This class collects the request and map it to the entity class
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SupplierRequestDto {

    private Long id;

    @NotBlank(message = "Name can not be empty")
    private String name;

    @NotNull(message = "State ID can not be empty")
    @Min(message = "State ID can not be less than 0", value = 1)
    private Long stateID;

    @NotBlank(message = "Address can not be empty")
    private String address;

    @NotBlank(message = "Phone can not be empty")
    private String phone;

    @NotBlank(message = "Email can not be empty")
    @Email
    private String email;

    @NotBlank(message = "Website can not be empty")
    private String website;

    @NotNull(message = "isActive can not be empty")
    private Boolean isActive;

    @NotNull(message = "Supplier Category ID can not be empty")
    @Min(message = "Supplier Category ID can not be less than 0", value = 1)
    private Long supplierCategoryID;

    @NotBlank(message = "Contact Person can not be empty")
    private String contactPerson;

    @NotBlank(message = "Contact Phone can not be empty")
    private String contactPhone;

    @NotBlank(message = "Contact Email can not be empty")
    private String contactEmail;

    @NotNull(message = "Discount Provided can not be empty")
    @DecimalMin(value = "0.0", message = "Discount Provided can not be less than 0.0")
    private Double discountProvided;
}
