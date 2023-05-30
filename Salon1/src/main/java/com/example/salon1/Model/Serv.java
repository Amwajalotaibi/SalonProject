package com.example.salon1.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Email
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Serv {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "varchar(10) not null")
    private String name;

    @Column(columnDefinition = "varchar(20) not null check (category='hair style' or category='makeup' or category='spa' or category='body care')")
    private String category;

    @ManyToMany (mappedBy = "servs")
    private Set<Appointment> appointments;


}
