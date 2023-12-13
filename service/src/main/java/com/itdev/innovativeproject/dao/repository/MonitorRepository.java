package com.itdev.innovativeproject.dao.repository;
import com.itdev.innovativeproject.dao.entity.Monitor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface MonitorRepository extends JpaRepository<Monitor,Long>{
}
