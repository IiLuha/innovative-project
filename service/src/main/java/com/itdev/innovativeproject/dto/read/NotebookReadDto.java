package com.itdev.innovativeproject.dto.read;

import com.itdev.innovativeproject.dao.entity.ComputerDetails;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Data
public class NotebookReadDto {

    private final Long id;
    private final Long productionId;          // ID of the associated Production entity
    private final ComputerDetailsReadDto computerDetails;
    private final Integer diagonal;
}


