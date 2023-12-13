package com.itdev.innovativeproject.dto.createedit;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Data
public class MonitorCreateEditDto {

    private final Long productionId;
    private final Long displayTypeId;
    private final Integer diagonalMon;
    private final Integer frequency;
}


