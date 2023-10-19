package com.itdev.innovativeproject.dao.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="Form_factor")
public class Form_factor implements BaseEntity<Integer> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private Integer id;

    @Column(name="Name")
    private String name;
    //constructors

    public Form_factor() {
    }

    public Form_factor(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
    //methods

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Form_factor)) return false;
        Form_factor that = (Form_factor) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Form_factor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
