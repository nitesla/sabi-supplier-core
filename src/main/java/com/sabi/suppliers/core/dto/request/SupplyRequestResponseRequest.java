package com.sabi.suppliers.core.dto.request;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class SupplyRequestResponseRequest {

    private Long id;
    private String status;
    private Long userId;
    private Long supplyRequestId;
    private LocalDateTime responseDate;
    private String rejectReason;
}
