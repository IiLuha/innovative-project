package com.itdev.innovativeproject.dao.entity;

import lombok.Data;

@Data
public class MonitorCreateEditDto {
    private Long productionId;
    private Long displayTypeId;
    private int diagonalMon;
    private int frequency;
}

