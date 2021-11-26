package com.sabi.suppliers.core.dto.request;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 *
 * This class collects the request and map it to the entity class
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SupplierLocationRequestDto {

    private Long id;

    @NotNull(message = "Supplier ID can not be empty")
    @Min(message = "Supplier ID can not be less than 0", value = 1)
    private Long supplierID;

    @NotNull(message = "State ID can not be empty")
    @Min(message = "State ID can not be less than 0", value = 1)
    private Long stateID;

}
