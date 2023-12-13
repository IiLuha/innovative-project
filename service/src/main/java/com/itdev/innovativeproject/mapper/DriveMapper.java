package com.itdev.innovativeproject.mapper;

import com.itdev.innovativeproject.dao.entity.Drive;
import com.itdev.innovativeproject.dao.repository.DiskTypeRepository;
import com.itdev.innovativeproject.dao.repository.ProductionRepository;
import com.itdev.innovativeproject.dto.createedit.DriveCreateEditDto;
import com.itdev.innovativeproject.dto.read.DriveReadDto;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public abstract class DriveMapper {

    @Autowired
    protected ProductionRepository productionRepository;
    @Autowired
    protected DiskTypeRepository diskTypeRepository;

    @Mappings({
            @Mapping(source = "production.id", target = "productionId"),
            @Mapping(source = "diskType.name", target = "diskTypeName")
    })
    public abstract DriveReadDto driveToDto(Drive drive);

    @Mappings({
            @Mapping(target = "production",
                    expression = "java(productionRepository.findById(drive.getProductionId()).orElseThrow())"),
            @Mapping(target = "diskType",
                    expression = "java(diskTypeRepository.findById(drive.getDiskTypeId()).orElseThrow())"),
    })
    public abstract Drive dtoToDrive (DriveCreateEditDto drive);
}
