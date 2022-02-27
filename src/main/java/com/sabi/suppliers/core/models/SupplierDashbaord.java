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
public class SupplierDashbaord extends CoreEntity {

    private int pendingOrder;
    private int completedOrder;
    private int cancelledOrder;
    private int ongoingDelivery;
    private double totalSales;
    private int warehouses;
    private int products;
    private double outstandingPayment;
}
