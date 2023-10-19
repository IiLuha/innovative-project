package com.itdev.innovativeproject.dao.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="Display_type")
public class Display_type implements BaseEntity<Integer> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name ="ID")
    private Integer id;
    @Column(name="Name")
    private String name;
    //constructors

    public Display_type() {
    }

    public Display_type(Integer id, String name) {
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
    public String toString() {
        return "Display_type{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Display_type)) return false;
        Display_type that = (Display_type) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
