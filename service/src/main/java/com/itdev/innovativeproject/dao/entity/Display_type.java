package com.itdev.innovativeproject.dao.entity;
import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name = "Display_type")
@Data // Generates getters, setters, toString, equals, and hashCode
public class Display_type implements BaseEntity<Integer> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "Name")
    private String name;
}
