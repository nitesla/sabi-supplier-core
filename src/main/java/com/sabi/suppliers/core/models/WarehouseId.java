package com.sabi.suppliers.core.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
public class WarehouseId {

    private Long id;
    private Long warehouseId;
    @ManyToOne
    @JoinColumn(name="id", nullable=false)
    private SupplierGood supplierGood;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }

    public Long getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Long warehouseId) {
        this.warehouseId = warehouseId;
    }

    public SupplierGood getSupplierGood() {
        return supplierGood;
    }

    public void setSupplierGood(SupplierGood supplierGood) {
        this.supplierGood = supplierGood;
    }
}
