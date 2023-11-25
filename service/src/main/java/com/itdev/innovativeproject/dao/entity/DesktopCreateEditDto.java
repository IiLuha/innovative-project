package com.itdev.innovativeproject.dao.entity;

import lombok.Value;

@Value
public class DesktopCreateEditDto {
    private Long productionId;
    private Long formFactorId;      // ?
    private Long computerDetailsId; // здесь id должен быть?
    private String screen;
}
