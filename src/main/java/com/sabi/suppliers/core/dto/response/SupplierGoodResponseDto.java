package com.sabi.suppliers.core.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SupplierGoodResponseDto {

    private Long id;
    private Long supplierId;
    private Long variantId;
    private double price;
    private int totalQuantityAvailable;
    private int quantitySold;
    private int quantity;
    private Integer committedStock;
    private Integer minimumOrderQuantity;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Long createdBy;
    private Long updatedBy;
    private String variantName;
    private String variantPicture;
    private int availableLocations;
    private Boolean isActive;
}
