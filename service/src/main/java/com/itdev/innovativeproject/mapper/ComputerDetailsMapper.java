package com.itdev.innovativeproject.mapper;

import com.itdev.innovativeproject.dao.entity.ComputerDetails;
import com.itdev.innovativeproject.dao.entity.DiskType;
import com.itdev.innovativeproject.dao.repository.DiskTypeRepository;
import com.itdev.innovativeproject.dto.createedit.ComputerDetailsCreateEditDto;
import com.itdev.innovativeproject.dto.read.ComputerDetailsReadDto;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public abstract class ComputerDetailsMapper {

    @Autowired
    protected DiskTypeRepository diskTypeRepository;

    @Mapping(source = "diskType.name", target = "diskTypeName")
    public abstract ComputerDetailsReadDto computerDetailsToDto(ComputerDetails computerDetails);

    @Mapping(target = "diskType",
            expression = "java(diskTypeRepository.findById(computerDetails.getDiskTypeId()).orElseThrow())")
    public abstract ComputerDetails dtoToComputerDetails(ComputerDetailsCreateEditDto computerDetails);
}
