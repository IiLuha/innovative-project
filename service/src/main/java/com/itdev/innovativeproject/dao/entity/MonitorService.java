package com.itdev.innovativeproject.dao.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional(readOnly = true)
public class MonitorService {

    private final MonitorRepository monitorRepository;

    @Autowired
    public MonitorService(MonitorRepository monitorRepository) {
        this.monitorRepository = monitorRepository;
    }

    public Monitor createMonitor(Monitor monitor) {
        return monitorRepository.save(monitor);
    }

    public List<Monitor> getAllMonitors() {
        return monitorRepository.findAll();
    }

    public Monitor getMonitorById(Integer id) {
        return monitorRepository.findByMonitorId(id);
    }

    public void deleteMonitor(Integer id) {
        monitorRepository.deleteById(id);
    }

    public List<Monitor> findMonitorsByDisplayType(DisplayType displayType) {
        List<Monitor> monitors = monitorRepository.findAll();
        List<Monitor> result = new ArrayList<>();

        for (Monitor monitor : monitors) {
            if (monitor.getDisplayType().equals(displayType)) {
                result.add(monitor);
            }
        }

        return result;
    }

    public List<Monitor> findMonitorsByDiagonalSizeRange(int minDiagonal, int maxDiagonal) {
        List<Monitor> monitors = monitorRepository.findAll();
        List<Monitor> result = new ArrayList<>();

        for (Monitor monitor : monitors) {
            int diagonal = monitor.getDiagonalMon();
            if (diagonal >= minDiagonal && diagonal <= maxDiagonal) {
                result.add(monitor);
            }
        }

        return result;
    }

    public List<Monitor> findMonitorByFrequency(int minFrequency, int maxFrequency) {
        List<Monitor> monitors = monitorRepository.findAll();
        List<Monitor> result = new ArrayList();

        for (Monitor monitor : monitors) {
            int frequency = monitor.getFrequency();
            if (frequency >= minFrequency && frequency <= maxFrequency) {
                result.add(monitor);
            }
        }

        return result;
    }
}
