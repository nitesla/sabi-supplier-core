package com.sabi.suppliers.core.models;

import com.sabi.framework.models.CoreEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper=false)
@Data
@Entity
public class Manufacturer extends CoreEntity {

    private String name;
    private Long stateID;
    private String address;
    private String phone;
    private String email;
    private String website;

}
