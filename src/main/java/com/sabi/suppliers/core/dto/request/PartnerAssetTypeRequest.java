package com.sabi.suppliers.core.dto.request;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class PartnerAssetTypeRequest {

    private Long assetTypeId;
    private int total;
}
