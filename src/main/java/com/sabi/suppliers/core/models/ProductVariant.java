package com.sabi.suppliers.core.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.sabi.framework.models.CoreEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Transient;

@EqualsAndHashCode(callSuper=false)
@Data
@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductVariant extends CoreEntity {

    private String name;
    private Long productId;
    private String picture;
    private Integer rowPerPack;
    private Integer pieceaPerRow;
    private double price;
    private double leastPrice;
    private double maxPrice;
    @Transient
    private String productName;
    private String productCategory;
}
