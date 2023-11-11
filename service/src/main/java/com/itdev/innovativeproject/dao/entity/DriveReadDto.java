package com.itdev.innovativeproject.dao.entity;

import lombok.Data;

@Data
public class DriveReadDto {
    private Long id;
    private Long productionId;  // ID of the associated Production entity
    private Long diskTypeId;     // ID of the associated DiskType entity
    private int capacity;
    private int readSpeed;
}
