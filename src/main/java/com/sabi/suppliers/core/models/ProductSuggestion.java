package com.sabi.suppliers.core.models;

import com.sabi.framework.models.CoreEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;

@EqualsAndHashCode(callSuper=false)
@Data
@Entity
public class ProductSuggestion extends CoreEntity {

    private String name;
    private String description;
    private String manufacturer;
    private String image;
    private String status;
}
