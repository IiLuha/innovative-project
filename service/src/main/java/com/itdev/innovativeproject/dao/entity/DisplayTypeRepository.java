package com.itdev.innovativeproject.dao.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DisplayTypeRepository extends JpaRepository<DisplayType,Integer> {
    DisplayType save(DisplayType display_type);
    List<DisplayType> findAll();

    Drive findByDisplay_typeId(Integer id);

    void deleteById(Integer id);
}
