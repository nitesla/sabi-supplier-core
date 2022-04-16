package com.sabi.suppliers.core.models;

import com.sabi.framework.models.CoreEntity;
import lombok.*;

import javax.persistence.Entity;
import java.math.BigDecimal;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
public class SupplyRequestCounterOffer extends CoreEntity {

    private Long supplyRequestId;
    private Long userId;
    private BigDecimal price;
    private Integer quantity;
}
