package com.sabisupplierscore.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class WareHouseRequest {
    private Long id;
    @NotBlank(message = "User Id can not be blank")
    private Long userId;
    @NotNull(message = "Ware house ID can not be blank")
    private Long wareHouseId;
}
