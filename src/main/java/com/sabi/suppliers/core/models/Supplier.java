package com.sabi.suppliers.core.models;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.sabi.framework.models.CoreEntity;
import lombok.*;

import javax.persistence.Entity;

/**
 *
 * This class is responsible for persisting to the database
 */


@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Supplier extends CoreEntity {


    private String name;

    private Long lgaId;

    private Long userId;

    private String address;

    private String phone;

    private String email;

    private String website;

    private Long supplierCategoryId;

    private String contactPerson;

    private String contactPhone;

    private String contactEmail;

    private double discountProvided;

    private String deliveryType;


}