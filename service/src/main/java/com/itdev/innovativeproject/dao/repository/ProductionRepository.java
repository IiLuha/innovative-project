package com.itdev.innovativeproject.dao.repository;

import com.itdev.innovativeproject.dao.entity.Production;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductionRepository extends JpaRepository<Production,Long> {
}
