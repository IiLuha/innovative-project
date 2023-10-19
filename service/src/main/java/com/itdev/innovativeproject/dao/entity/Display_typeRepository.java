package com.itdev.innovativeproject.dao.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Display_typeRepository extends JpaRepository<Display_type,Integer> {
    Display_type save(Display_type display_type);
    List<Display_type> findAll();

    Drive findByDisplay_typeId(Integer id);

    void deleteById(Integer id);
}
