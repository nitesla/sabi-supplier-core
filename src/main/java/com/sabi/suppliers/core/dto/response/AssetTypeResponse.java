package com.sabi.suppliers.core.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AssetTypeResponse {

    private String code;
    private String description;
    private List<AssetTypeData> data;
}
