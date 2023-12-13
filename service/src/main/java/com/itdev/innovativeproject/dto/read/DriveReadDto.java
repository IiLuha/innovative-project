package com.itdev.innovativeproject.dto.read;

import com.itdev.innovativeproject.dao.entity.DiskType;
import lombok.*;

@Data
public class DriveReadDto {

    private final Long id;
    private final Long productionId;
    private final String diskTypeName;
    private final Integer capacity;
    private final Integer readSpeed;
}
