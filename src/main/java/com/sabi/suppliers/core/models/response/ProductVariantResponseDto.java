package com.sabi.suppliers.core.models.response;

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
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Long createdBy;
    private Long updatedBy;
    private Boolean isActive;
}
