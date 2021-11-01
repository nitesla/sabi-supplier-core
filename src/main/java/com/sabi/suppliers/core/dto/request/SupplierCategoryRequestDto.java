package com.sabi.suppliers.core.dto.request;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 *
 * This class collects the request and map it to the entity class
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SupplierCategoryRequestDto {

    private Long id;

    @NotBlank(message = "Name can not be empty")
    private String name;

    @NotNull(message = "Credit Period can not be empty")
    @Min(message = "Credit Period can not be less than 0", value = 1)
    private Integer creditPeriod;

    @NotNull(message = "isActive can not be empty")
    @Pattern(regexp = "^true$|^false$", message = "Allowed input: true or false")
    private Boolean isActive;
}
