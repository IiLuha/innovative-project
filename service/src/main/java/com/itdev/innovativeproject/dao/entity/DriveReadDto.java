package com.itdev.innovativeproject.dao.entity;

import lombok.*;

@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class DriveReadDto {
    private final Long id;
    private final Long productionId;  // ID of the associated Production entity
    private final DiskType diskType;  // Associated DiskType
    private final int capacity;
    private final int readSpeed;
}
