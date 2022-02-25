package com.sabi.suppliers.core.models.response;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SupplyRequestResponseResponse {
    private Long id;
    private String status;
    private Long userId;
    private Long supplyRequestId;
    private Date responseDate;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private Long createdBy;
    private Long updatedBy;
    private Boolean isActive;
    private String rejectReason;
}
