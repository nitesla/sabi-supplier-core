package com.sabi.suppliers.core.models;


import com.fasterxml.jackson.annotation.JsonInclude;
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
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SupplierLocation extends CoreEntity {


    private Long supplierID;

    private Long stateID;


}
