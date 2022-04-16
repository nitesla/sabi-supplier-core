package com.sabi.suppliers.core.dto.request;

import lombok.Data;

@Data
public class ProductSuggestionRequestDto {

    private Long id;
    private String name;
    private String description;
    private String manufacturer;
    private String image;
    private String status;
}
