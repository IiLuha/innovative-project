package com.itdev.innovativeproject.dao.entity;

import lombok.Data;

@Data
public class DriveCreateEditDto {
    private Long productionId;
    private Long diskTypeId;
    private int capacity;
    private int readSpeed;
}
