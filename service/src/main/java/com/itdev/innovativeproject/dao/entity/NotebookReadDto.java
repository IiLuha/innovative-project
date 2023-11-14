package com.itdev.innovativeproject.dao.entity;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
@EqualsAndHashCode
public class NotebookReadDto {
    private final Long id;
    private final Long productionId;          // ID of the associated Production entity
    private final ComputerDetails computerDetails;
    private final int diagonal;
}


