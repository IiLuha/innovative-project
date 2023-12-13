package com.itdev.innovativeproject.service;

import com.itdev.innovativeproject.dao.repository.NotebookRepository;
import com.itdev.innovativeproject.dto.createedit.NotebookCreateEditDto;
import com.itdev.innovativeproject.dto.read.NotebookReadDto;
import com.itdev.innovativeproject.mapper.NotebookMapper;
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
public class NotebookService {

    private final NotebookRepository notebookRepository;
    private final NotebookMapper notebookMapper;

    public Page<NotebookReadDto> findAll(Pageable pageable) {
        return notebookRepository.findAll(pageable)
                .map(notebookMapper::notebookToDto);
    }
    public List<NotebookReadDto> findAll() {
        return notebookRepository.findAll().stream()
                .map(notebookMapper::notebookToDto)
                .toList();
    }

    public Optional<NotebookReadDto> findById(Long id) {
        return notebookRepository.findById(id)
                .map(notebookMapper::notebookToDto);
    }

    @Transactional
    public NotebookReadDto createNotebook (NotebookCreateEditDto notebookDto) {
        return Optional.of(notebookDto)
                .map(notebookMapper::dtoToNotebook)
                .map(notebookRepository::save)
                .map(notebookMapper::notebookToDto)
                .orElseThrow();
    }

    @Transactional
    public Optional<NotebookReadDto> updateNotebook (Long id, NotebookCreateEditDto notebookDto) {
        if (notebookRepository.findById(id).isEmpty()) return Optional.empty();
        return Optional.of(notebookDto)
                .map(notebookMapper::dtoToNotebook)
                .map(notebookRepository::saveAndFlush)
                .map(notebookMapper::notebookToDto);
    }

    @Transactional
    public boolean deleteNotebook(Long id) {
        return notebookRepository.findById(id)
                .map(entity -> {
                    notebookRepository.delete(entity);
                    notebookRepository.flush();
                    return true;
                })
                .orElse(false);
    }
}
