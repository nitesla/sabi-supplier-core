package com.sabi.suppliers.core.models;

import com.sabi.framework.models.CoreEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;

@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Data
@Entity
public class ProductCount extends CoreEntity {

   private Long shipmentId;
   private Long productId;
   private String name;
   private Long quantity;

}
