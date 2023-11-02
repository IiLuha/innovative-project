package com.itdev.innovativeproject.dao.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FormFactorRepository extends JpaRepository<FormFactor,Integer> {
    FormFactor save(FormFactor form_factor);
    List<FormFactor> findAll();

    Drive findByForm_factorId(Integer id);

    void deleteById(Integer id);

}
