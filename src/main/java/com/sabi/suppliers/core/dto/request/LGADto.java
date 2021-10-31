package com.sabi.suppliers.core.dto.request;

import lombok.Data;

/**
 *
 * This class collects the request and map it to the entity class
 */

@Data
public class LGADto {
    private Long id;

    private String name;

    private long stateId;
}
