package com.sabi.suppliers.core.models;


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
public class SupplierLocation extends CoreEntity {


    private Long supplierId;
    private Long stateId;
    private int warehouse;


}
