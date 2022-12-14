package com.sabi.suppliers.core.models;

import com.sabi.framework.models.CoreEntity;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Transient;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class WareHouse extends CoreEntity {
    private Long productId;
    private Long supplierId;
    private Long stateId;
    private String address;
    private String contactPerson;
    private String contactPhone;
    private String contactEmail;
    private String longitude;
    private String latitude;
    private Long userId;
    private Long lgaId;
    private Integer productCount;
    private String name;
    private Boolean isDefault;
    private String stateName;
    @Transient
    private String lgaName;
    @Transient
    private Integer wareHouseUserCount;
}
