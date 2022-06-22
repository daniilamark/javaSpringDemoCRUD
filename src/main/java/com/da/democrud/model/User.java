package com.da.democrud.model;

import lombok.Data;

import javax.persistence.*;

@Data // стандартные методы геттеры и сеттеры
@Entity //  связь  с бд
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

}
