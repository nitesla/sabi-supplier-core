package com.sabi.suppliers.core.dto.request;

import com.sabi.suppliers.core.models.SupplierLocation;
import lombok.Data;

import java.util.List;

@Data
public class CompleteSignUpDto {

    private Long id;
    private String supplierCategoryId;
    private String address;
    private String email;
    private String lgaId;
    private String phone;
    private String webSite;
    private String contactPerson;
    private String contactPhone;
    private String contactEmail;
//    private List<PartnerAssetType> assets;
    private List<SupplierLocation> locations;
    private String deliveryType;
}
