package com.sabi.suppliers.core.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class SupplierBankRequest {
    private Long id;
    @NotNull(message = "Supplier id is required")
    private Long supplierId;
    @NotNull(message = "Bank id is required")
    private Long bankId;
    @NotBlank(message = "Account Number is required")
    private String accountNumber;
}
