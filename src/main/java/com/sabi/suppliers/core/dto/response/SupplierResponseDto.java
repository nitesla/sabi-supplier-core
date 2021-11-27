package com.sabi.suppliers.core.dto.response;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SupplierResponseDto {

    private Long id;

    private String name;

    private Long stateID;

    private String address;

    private String phone;

    private String email;

    private String website;

    private Long supplierCategoryID;

    private String contactPerson;

    private String contactPhone;

    private String contactEmail;

    private double discountProvided;

    private LocalDateTime createdDate;

    private LocalDateTime updatedDate;

    private Long createdBy;

    private Long updatedBy;

    private Boolean isActive;
}
