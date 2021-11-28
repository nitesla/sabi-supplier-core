package com.sabi.suppliers.core.dto.request;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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

    private String name;

    private Integer creditPeriod;

    private Boolean isActive;
}
