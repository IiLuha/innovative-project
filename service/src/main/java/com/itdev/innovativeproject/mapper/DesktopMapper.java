package com.itdev.innovativeproject.mapper;

import com.itdev.innovativeproject.dao.entity.Desktop;
import com.itdev.innovativeproject.dao.repository.ComputerDetailsRepository;
import com.itdev.innovativeproject.dao.repository.FormFactorRepository;
import com.itdev.innovativeproject.dao.repository.ProductionRepository;
import com.itdev.innovativeproject.dto.createedit.DesktopCreateEditDto;
import com.itdev.innovativeproject.dto.read.DesktopReadDto;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper(uses = {ComputerDetailsMapper.class},
        componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public abstract class DesktopMapper {

    @Autowired
    protected ProductionRepository productionRepository;
    @Autowired
    protected ComputerDetailsRepository computerDetailsRepository;
    @Autowired
    protected FormFactorRepository formFactorRepository;

    @Mappings({
            @Mapping(source = "production.id", target = "productionId"),
            @Mapping(source = "formFactor.name", target = "formFactorName")
    })
    public abstract DesktopReadDto desktopToDto(Desktop desktop);

    @Mappings({
            @Mapping(target = "production",
                    expression = "java(productionRepository.findById(desktop.getProductionId()).orElseThrow())"),
            @Mapping(target = "computerDetails",
                    expression = "java(computerDetailsRepository.findById(desktop.getComputerDetailsId()).orElseThrow())"),
            @Mapping(target = "formFactor",
                    expression = "java(formFactorRepository.findById(desktop.getFormFactorId()).orElseThrow())")
    })
    public abstract Desktop dtoToDesktop(DesktopCreateEditDto desktop);
}
