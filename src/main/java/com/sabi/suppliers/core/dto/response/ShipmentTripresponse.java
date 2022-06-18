package com.sabi.suppliers.core.dto.response;


import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ShipmentTripresponse {

    private String code;
    private String description;
}
