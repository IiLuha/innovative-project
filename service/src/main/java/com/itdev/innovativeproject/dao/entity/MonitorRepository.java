package com.itdev.innovativeproject.dao.entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MonitorRepository extends JpaRepository<Monitor,Integer>{
    Monitor save(Monitor monitor);
    List<Monitor> findAll();
    Monitor findByMonitorId(Integer id);

    void deleteById(Integer id);


}
