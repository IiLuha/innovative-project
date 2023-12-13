package com.itdev.innovativeproject.dto.createedit;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Data
public class DriveCreateEditDto {

    private final Long productionId;
    private final Long diskTypeId;
    private final Integer capacity;
    private final Integer readSpeed;
}

