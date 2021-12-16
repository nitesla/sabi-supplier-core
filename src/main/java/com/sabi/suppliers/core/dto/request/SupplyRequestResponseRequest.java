package com.sabi.suppliers.core.dto.request;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class SupplyRequestResponseRequest {

    private Long id;
    @NotBlank(message = "Status is required")
    private String status;
    @NotNull(message = "User Id is required")
    private Long userId;
    @NotNull(message = "Supply Request id is required")
    private Long supplyRequestId;
    @NotNull(message = "Response Date is required")
    private Date responseDate;
    private String rejectReason;
}
