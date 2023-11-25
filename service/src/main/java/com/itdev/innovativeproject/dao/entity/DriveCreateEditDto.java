package com.itdev.innovativeproject.dao.entity;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class DriveCreateEditDto {
    private final Long productionId;
    private final Long diskTypeId;
    private final int capacity;
    private final int readSpeed;
}

