package com.sabi.suppliers.core.models.response;

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
public class ProductResponseDto {

    private Long id;
    private String name;
    private Long manufacturerId;
    private Long productCategoryId;
    private double weight;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Long createdBy;
    private Long updatedBy;
    private Boolean isActive;
}
