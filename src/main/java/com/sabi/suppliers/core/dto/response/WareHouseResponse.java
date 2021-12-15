package com.sabi.suppliers.core.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WareHouseResponse {
    private Long id;
    private Long productId;
    private Long supplierId;
    private Long stateId;
    private String address;
    private String contactPerson;
    private String contactPhone;
    private String contactEmail;
    private String longitude;
    private String latitude;
    private Long userId;
    private Long lgaId;
    private Long productCount;
    private String name;
    private String stateName;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Long createdBy;
    private Long updatedBy;
    private Boolean isActive;
    private Integer wareHouseUserCount;
}
