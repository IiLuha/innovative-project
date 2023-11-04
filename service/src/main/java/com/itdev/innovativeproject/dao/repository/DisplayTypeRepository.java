package com.itdev.innovativeproject.dao.repository;

import com.itdev.innovativeproject.dao.entity.DisplayType;
import com.itdev.innovativeproject.dao.entity.Drive;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DisplayTypeRepository extends JpaRepository<DisplayType, Integer> {
}
