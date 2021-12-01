package com.sabi.suppliers.core.models;

import com.sabi.framework.models.CoreEntity;
import lombok.*;

import javax.persistence.Entity;
import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
public class SupplyRequestResponseEntity extends CoreEntity {

    private String status;
    private Long userId;
    private Long supplyRequestId;
    private Date responseDate;
}
