package com.sabi.suppliers.core.models;

import com.sabi.framework.models.CoreEntity;
import lombok.*;

import javax.persistence.Entity;
import java.time.LocalDateTime;


@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class WareHouseUser extends CoreEntity {
    private Long userId;
    private Long wareHouseId;
}
