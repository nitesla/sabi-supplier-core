package com.sabi.suppliers.core.models;

import com.sabi.framework.models.CoreEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Transient;

@EqualsAndHashCode(callSuper=false)
@Data
@Entity
public class Product extends CoreEntity {


    private String name;
    private Long manufacturerId;
    private Long productCategoryId;
    @Lob
    private String image;
    private double weight;
    @Transient
    private String manufactureName;
    @Transient
    private String productCategoryName;
}
