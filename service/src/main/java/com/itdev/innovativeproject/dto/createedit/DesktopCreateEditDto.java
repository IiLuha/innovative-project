package com.itdev.innovativeproject.dto.createedit;

import lombok.Data;

@Data
public class DesktopCreateEditDto {

    private final Long productionId;
    private final Long formFactorId;
    private final Long computerDetailsId;
    private final String screen;
}
