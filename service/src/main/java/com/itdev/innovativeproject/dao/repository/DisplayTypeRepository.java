package com.itdev.innovativeproject.dao.repository;

import com.itdev.innovativeproject.dao.entity.DisplayType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DisplayTypeRepository extends JpaRepository<DisplayType,Long> {
}