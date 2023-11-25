package com.itdev.innovativeproject.dao.entity;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
@EqualsAndHashCode
public class MonitorCreateEditDto {
    private final Long productionId;
    private final Long displayTypeId;
    private final int diagonalMon;
    private final int frequency;
}


