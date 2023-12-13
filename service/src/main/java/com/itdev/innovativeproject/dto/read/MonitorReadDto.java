package com.itdev.innovativeproject.dto.read;

import com.itdev.innovativeproject.dao.entity.DisplayType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Data
public class MonitorReadDto {

    private final Long id;
    private final Long productionId;
    private final String displayTypeName;
    private final Integer diagonalMon;
    private final Integer frequency;
}
