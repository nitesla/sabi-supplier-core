package com.sabi.suppliers.core.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.sabi.framework.models.CoreEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.time.LocalDateTime;

@NoArgsConstructor
@EqualsAndHashCode(callSuper=false)
@Data
@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Stock extends CoreEntity {

    private Long supplierGoodId;
    private LocalDateTime actionDate;
    private String action;
    private int initialQuantity;
    private int quantity;
    private int finalQuantity;
    private Long userId;
}
