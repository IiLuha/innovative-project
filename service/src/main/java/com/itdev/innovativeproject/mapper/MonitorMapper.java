package com.itdev.innovativeproject.mapper;

import com.itdev.innovativeproject.dao.entity.Monitor;
import com.itdev.innovativeproject.dao.repository.DisplayTypeRepository;
import com.itdev.innovativeproject.dao.repository.ProductionRepository;
import com.itdev.innovativeproject.dto.createedit.MonitorCreateEditDto;
import com.itdev.innovativeproject.dto.read.MonitorReadDto;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public abstract class MonitorMapper {

    @Autowired
    protected ProductionRepository productionRepository;
    @Autowired
    protected DisplayTypeRepository displayTypeRepository;

    @Mappings({
            @Mapping(source = "production.id", target = "productionId"),
            @Mapping(source = "displayType.name", target = "displayTypeName")
    })
    public abstract MonitorReadDto monitorToDto(Monitor monitor);

    @Mappings({
            @Mapping(target = "production",
                    expression = "java(productionRepository.findById(monitor.getProductionId()).orElseThrow())"),
            @Mapping(target = "displayType",
                    expression = "java(displayTypeRepository.findById(monitor.getDisplayTypeId()).orElseThrow())")
    })
    public abstract Monitor dtoToMonitor(MonitorCreateEditDto monitor);
}
