package com.itdev.innovativeproject.service;

import com.itdev.innovativeproject.dao.entity.DesktopCreateEditDto;
import com.itdev.innovativeproject.dao.entity.DesktopReadDto;
import com.itdev.innovativeproject.dao.repository.DesktopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class DesktopService {

    private final DesktopRepository desktopRepository;
    @Autowired
    public DesktopService(DesktopRepository desktopRepository) {
        this.desktopRepository = desktopRepository;
    }

    public List<DesktopReadDto> findAll() {
    }

    public Optional<DesktopReadDto> findById(Long id) {
    }

    @Transactional
    public DesktopReadDto createDesktop (DesktopCreateEditDto desktopDto) {
    }

    @Transactional
    public Optional<DesktopReadDto> updateDesktop(Long id, DesktopCreateEditDto desktopDto) {
    }

    @Transactional
    public boolean deleteDesktop(Long id) {
    }


}
