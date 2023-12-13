package com.itdev.innovativeproject.dto.read;

import lombok.Data;

@Data
public class MonitorReadDto {

    private final Long id;
    private final Long productionId;
    private final String displayTypeName;
    private final Integer diagonalMon;
    private final Integer frequency;
}
