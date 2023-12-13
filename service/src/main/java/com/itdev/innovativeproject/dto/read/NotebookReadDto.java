package com.itdev.innovativeproject.dto.read;

import lombok.Data;

@Data
public class NotebookReadDto {

    private final Long id;
    private final Long productionId;          // ID of the associated Production entity
    private final ComputerDetailsReadDto computerDetails;
    private final Integer diagonal;
}


