package com.sabi.suppliers.core.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.sabi.framework.models.CoreEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper=false)
@Data
@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SupplierGood extends CoreEntity {

    private Long supplierId;
    private Long variantId;
    private double price;
    private int totalQuantityAvailable;
    private int quantitySold;
    private int quantity;
}
