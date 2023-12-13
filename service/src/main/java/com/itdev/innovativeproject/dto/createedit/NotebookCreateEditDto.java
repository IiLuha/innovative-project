package com.itdev.innovativeproject.dto.createedit;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Data
public class NotebookCreateEditDto {

    private final Long productionId;
    private final Long computerDetailsId;
    private final Integer diagonal;
}
