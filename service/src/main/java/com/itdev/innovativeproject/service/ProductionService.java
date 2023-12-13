package com.itdev.innovativeproject.service;

import com.itdev.innovativeproject.dao.repository.ProductionRepository;
import com.itdev.innovativeproject.dto.createedit.ProductionCreateEditDto;
import com.itdev.innovativeproject.dto.read.ProductionReadDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class ProductionService {
    private final ProductionRepository productionRepository;
    @Autowired
    public ProductionService(ProductionRepository productionRepository) {
        this.productionRepository = productionRepository;
    }

    public List<ProductionReadDto> findAll() {
        return null;
    }

    public Optional<ProductionReadDto> findById(Long id) {
        return Optional.empty();
    }

    @Transactional
    public ProductionReadDto createProduction (ProductionCreateEditDto productionDto) {
        return null;
    }

    @Transactional
    public Optional<ProductionReadDto> updateProduction (Long id, ProductionCreateEditDto productionDto) {
        return Optional.empty();
    }

    @Transactional
    public boolean deleteProduction(Long id) {
        return false;
    }



}
