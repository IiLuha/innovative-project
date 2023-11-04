package com.itdev.innovativeproject.dao.repository;

import com.itdev.innovativeproject.dao.entity.Drive;
import com.itdev.innovativeproject.dao.entity.FormFactor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FormFactorRepository extends JpaRepository<FormFactor,Integer> {
}
