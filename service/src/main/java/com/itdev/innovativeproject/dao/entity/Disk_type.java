package com.itdev.innovativeproject.dao.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="Disk_type")
public class Disk_type implements BaseEntity<Integer> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name ="ID")
    private Integer id;
    @Column(name="Name")
    private String name;
    //constructors
    public Disk_type() {
    }

    public Disk_type(Integer id, String name) {
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
        return "Disk_type{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Disk_type)) return false;
        Disk_type diskType = (Disk_type) o;
        return Objects.equals(id, diskType.id) && Objects.equals(name, diskType.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
