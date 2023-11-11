package com.itdev.innovativeproject.dao.entity;

import lombok.Data;

@Data
public class MonitorReadDto {
    private Long id;
    private Long productionId;      // ID of the associated Production entity
    private Long displayTypeId;     // ID of the associated DisplayType entity
    private int diagonalMon;
    private int frequency;
}
