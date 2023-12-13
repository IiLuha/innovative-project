package com.itdev.innovativeproject.service;

import com.itdev.innovativeproject.dao.entity.Production;
import com.itdev.innovativeproject.dao.repository.ProductionRepository;
import com.itdev.innovativeproject.dto.createedit.ProductionCreateEditDto;
import com.itdev.innovativeproject.dto.read.ProductionReadDto;
import com.itdev.innovativeproject.mapper.ProductionMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class ProductionService {

    private final ProductionRepository productionRepository;
    private final ProductionMapper productionMapper;
    
    public Page<ProductionReadDto> findAll(Pageable pageable) {
        return productionRepository.findAll(pageable)
                .map(productionMapper::productionToDto);
    }

    public List<ProductionReadDto> findAll() {
        return productionRepository.findAll().stream()
                .map(productionMapper::productionToDto)
                .toList();
    }

    public Optional<ProductionReadDto> findById(Long id) {
        return productionRepository.findById(id)
                .map(productionMapper::productionToDto);
    }

    @Transactional
    public ProductionReadDto createProduction (ProductionCreateEditDto productionDto) {
        return Optional.of(productionDto)
                .map(productionMapper::dtoToProduction)
                .map(productionRepository::save)
                .map(productionMapper::productionToDto)
                .orElseThrow();
    }

    @Transactional
    public Optional<ProductionReadDto> updateProduction (Long id, ProductionCreateEditDto productionDto) {
        Optional<Production> production = productionRepository.findById(id);
        if (production.isEmpty()) return Optional.empty();
        return Optional.of(productionDto)
                .map(productionMapper::dtoToProduction)
                .map(productionRepository::saveAndFlush)
                .map(productionMapper::productionToDto);
    }

    @Transactional
    public boolean deleteProduction(Long id) {
        return productionRepository.findById(id)
                .map(entity -> {
                    productionRepository.delete(entity);
                    productionRepository.flush();
                    return true;
                })
                .orElse(false);
    }
}
