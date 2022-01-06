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
public class SupplierRequestDto {

    private Long id;
    private String name;
    private String address;
    private String phone;
    private String email;
    private String website;
    private Long supplierCategoryID;
    private String contactPerson;
    private String contactPhone;
    private String contactEmail;
    private Double discountProvided;
}
