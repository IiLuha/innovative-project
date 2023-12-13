package com.itdev.innovativeproject.mapper;

import com.itdev.innovativeproject.dao.entity.Production;
import com.itdev.innovativeproject.dto.createedit.ProductionCreateEditDto;
import com.itdev.innovativeproject.dto.read.ProductionReadDto;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public abstract class ProductionMapper {

    public abstract ProductionReadDto productionToDto(Production production);
    public abstract Production dtoToProduction(ProductionCreateEditDto production);
}
