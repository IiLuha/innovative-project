package com.itdev.innovativeproject.dao.entity;

import lombok.Data;

@Data
public class NotebookReadDto {
    private Long id;
    private Long productionId;          // ID of the associated Production entity
    private Long computerDetailsId;     // ID of the associated ComputerDetails entity
    private int diagonal;
}

