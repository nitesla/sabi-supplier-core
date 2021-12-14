package com.sabi.suppliers.core.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.sabi.framework.models.CoreEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Data
@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WarehouseGoods extends CoreEntity {

    private Long warehouseId;
    private Long supplyGoodId;
    private int qtySold;
    private int qtyAvaliable;
    private int qty;
}
