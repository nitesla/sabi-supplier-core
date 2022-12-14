package com.sabi.suppliers.core.models;

import com.sabi.framework.models.CoreEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;

@EqualsAndHashCode(callSuper=false)
@Data
@Entity
public class ProductCategory extends CoreEntity {

    @Column(nullable = false)
    private String name;
    private String description;
}
