package com.itdev.innovativeproject.dto.read;

import lombok.Data;

@Data
public class DriveReadDto {

    private final Long id;
    private final Long productionId;
    private final String diskTypeName;
    private final Integer capacity;
    private final Integer readSpeed;
}
