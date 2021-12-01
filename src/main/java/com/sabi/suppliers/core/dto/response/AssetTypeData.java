package com.sabi.suppliers.core.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AssetTypeData {

    private int id;
    private String createdDate;
    private String updatedDate;
    private int createdBy;
    private int updatedBy;
    private boolean isActive;
    private String name;
    private String image;
    private String description;
}
