package com.sabi.suppliers.core.models;

import com.sabi.framework.models.CoreEntity;
import lombok.*;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
public class SupplyRequestResponseEntity extends CoreEntity {

    private Long id;
    private String status;
    private Long userId;
    private Long supplyRequestId;
}
