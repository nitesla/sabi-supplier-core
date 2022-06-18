package com.sabi.suppliers.core.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductVariantResponseDto {

    private Long id;
    private String name;
    private Long productId;
    private String picture;
    private Integer rowPerPack;
    private Integer pieceaPerRow;
    private double price;
    private double leastPrice;
    private double maxPrice;
    private String productName;
    private String productCategory;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Long createdBy;
    private Long updatedBy;
    private Boolean isActive;
}
