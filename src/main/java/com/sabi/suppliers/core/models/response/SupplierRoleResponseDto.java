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
public class SupplierRoleResponseDto {

    private Long id;
    private String name;
    private Long partnerId;
    private Long RoleId;
    private LocalDateTime updatedDate;
    private Long createdBy;
    private Long updatedBy;
    private Boolean isActive;
}
