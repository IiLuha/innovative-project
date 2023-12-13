package com.itdev.innovativeproject.dto.createedit;
import lombok.Data;

@Data
public class DriveCreateEditDto {

    private final Long productionId;
    private final Long diskTypeId;
    private final Integer capacity;
    private final Integer readSpeed;
}

