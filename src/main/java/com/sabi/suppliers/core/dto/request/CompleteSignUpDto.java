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
    private Long lgaId;
    private Long stateId;
    private String phone;
    private String webSite;
    private String contactPerson;
    private String contactPhone;
    private String contactEmail;
    private List<PartnerAssetTypeRequest> assets;
    private List<SupplierLocation> locations;
    private String deliveryType;


    private String password;
    private String firstName;
    private String lastName;
    private String userEmail;
    private String userPhone;
    private String name;

}
