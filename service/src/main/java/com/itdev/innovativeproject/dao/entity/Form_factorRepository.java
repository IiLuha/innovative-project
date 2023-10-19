package com.itdev.innovativeproject.dao.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Form_factorRepository extends JpaRepository<Form_factor,Integer> {
    Form_factor save(Form_factor form_factor);
    List<Form_factor> findAll();

    Drive findByForm_factorId(Integer id);

    void deleteById(Integer id);

}
