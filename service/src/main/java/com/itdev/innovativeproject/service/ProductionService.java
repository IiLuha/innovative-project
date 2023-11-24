package com.itdev.innovativeproject.service;

import com.itdev.innovativeproject.dao.entity.*;
import com.itdev.innovativeproject.dao.repository.ProductionRepository;
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
    }

    public Optional<ProductionReadDto> findById(Long id) {
    }

    @Transactional
    public ProductionReadDto createProduction (ProductionCreateEditDto productionDto) {
    }

    @Transactional
    public Optional<ProductionReadDto> updateProduction (Long id, ProductionCreateEditDto productionDto) {
    }

    @Transactional
    public boolean deleteProduction(Long id) {
    }



}
