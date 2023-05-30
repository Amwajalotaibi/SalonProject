package com.example.salon1.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @OneToMany(cascade = CascadeType.ALL,mappedBy = "staff")
    private Set<Appointment> appointmentSet;

//    @ManyToMany(mappedBy = "staff")
//    private Set<Serv> servSet;


}
