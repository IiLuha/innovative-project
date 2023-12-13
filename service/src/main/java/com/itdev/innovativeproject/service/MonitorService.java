package com.itdev.innovativeproject.service;

import com.itdev.innovativeproject.dao.repository.MonitorRepository;
import com.itdev.innovativeproject.dto.createedit.MonitorCreateEditDto;
import com.itdev.innovativeproject.dto.read.MonitorReadDto;
import com.itdev.innovativeproject.mapper.MonitorMapper;
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
public class MonitorService {

    private final MonitorRepository monitorRepository;
    private final MonitorMapper monitorMapper;

    public Page<MonitorReadDto> findAll(Pageable pageable) {
        return monitorRepository.findAll(pageable)
                .map(monitorMapper::monitorToDto);
    }
    public List<MonitorReadDto> findAll() {
        return monitorRepository.findAll().stream()
                .map(monitorMapper::monitorToDto)
                .toList();
    }

    public Optional<MonitorReadDto> findById(Long id) {
        return monitorRepository.findById(id)
                .map(monitorMapper::monitorToDto);
    }

    @Transactional
    public MonitorReadDto createMonitor (MonitorCreateEditDto monitorDto) {
        return Optional.of(monitorDto)
                .map(monitorMapper::dtoToMonitor)
                .map(monitorRepository::save)
                .map(monitorMapper::monitorToDto)
                .orElseThrow();
    }

    @Transactional
    public Optional<MonitorReadDto> updateMonitor (Long id, MonitorCreateEditDto monitorDto) {
        if (monitorRepository.findById(id).isEmpty()) return Optional.empty();
        return Optional.of(monitorDto)
                .map(monitorMapper::dtoToMonitor)
                .map(monitorRepository::saveAndFlush)
                .map(monitorMapper::monitorToDto);
    }

    @Transactional
    public boolean deleteMonitor(Long id) {
        return monitorRepository.findById(id)
                .map(entity -> {
                    monitorRepository.delete(entity);
                    monitorRepository.flush();
                    return true;
                })
                .orElse(false);
    }
}
