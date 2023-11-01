package com.itdev.innovativeproject.dao.entity;
import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name = "Display_type")
@Data
public class DisplayType implements BaseEntity<Integer> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
}

