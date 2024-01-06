package com.example.ejemploIndat2.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name ="Nombre", nullable = true)
    private String name;

    @Column(name = "Edad")
    private Integer age;

    @OneToMany(mappedBy = "user")
    private List<MascotaEntity> masc = new ArrayList<>();

}
