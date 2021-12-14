package com.sabi.suppliers.core.models;

import com.sabi.framework.models.CoreEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Transient;
import java.time.LocalDateTime;

@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Data
@Entity
public class Inventory extends CoreEntity {

    private Long supplierGoodId;
    private LocalDateTime deliveryDate;
    private String deliveryAddress;
    private String name;
    private Long warehouseId;
    private String Status;

    @Transient
    private String wareHouseAddress;
    @Transient
    private String productVariant;
}
