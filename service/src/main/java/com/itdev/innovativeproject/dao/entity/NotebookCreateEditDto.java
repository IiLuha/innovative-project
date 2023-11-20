package com.itdev.innovativeproject.dao.entity;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
@EqualsAndHashCode
public class NotebookCreateEditDto {
    private final Long productionId;
    private final Long computerDetailsId;
    private final int diagonal;
}
