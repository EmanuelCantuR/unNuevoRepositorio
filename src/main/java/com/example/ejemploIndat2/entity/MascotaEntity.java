package com.example.ejemploIndat2.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MascotaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name ="Nombre", nullable = true)
    private String name;

    @Column(name = "Especie")
    private String specie;

    @ManyToOne
    @JoinTable(name = "id_usuario")
    private UserEntity user;
}
