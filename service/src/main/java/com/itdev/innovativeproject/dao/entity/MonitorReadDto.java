package com.itdev.innovativeproject.dao.entity;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
@EqualsAndHashCode
public class MonitorReadDto {
    private final Long id;
    private final Long productionId;      // ID of the associated Production entity
    private final DisplayType displayType;
    private final int diagonalMon;
    private final int frequency;
}
