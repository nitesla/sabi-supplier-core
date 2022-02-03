package com.sabi.suppliers.core.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.sabi.framework.models.CoreEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Transient;
import java.math.BigDecimal;

@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Data
@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WareHouseGood extends CoreEntity {

    private Long warehouseId;
    private Long supplierGoodId;
    private int qtySold;
    private int qtyAvaliable;
    private double price;
    private int qty;
    private Integer commitedStock;
    private Integer minimumOrderQuantity;
    @Transient
    private Long variantId;
    @Transient
    private String variantName;
}
