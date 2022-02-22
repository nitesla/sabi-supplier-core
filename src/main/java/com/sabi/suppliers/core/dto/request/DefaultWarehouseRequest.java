package com.sabi.suppliers.core.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
public class DefaultWarehouseRequest {

    private Long id;
    private Boolean isDefault;
    private Long supplierId;
}
