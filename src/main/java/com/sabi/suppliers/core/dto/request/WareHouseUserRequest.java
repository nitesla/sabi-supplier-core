package com.sabi.suppliers.core.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class WareHouseUserRequest {
    private Long id;
    @NotNull(message = "Ware house id is required")
    private Long wareHouseId;
    @NotNull(message = "User id is required")
    private Long userId;
}
