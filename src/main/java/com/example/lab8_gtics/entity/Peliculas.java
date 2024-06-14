package com.example.lab8_gtics.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "movie")
public class Peliculas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idmovie", nullable = false)
    private Integer idmovie;

    @Column(name = "titulo", length = 45,nullable = false)
    private String titulo;

    @ManyToOne
    @JoinColumn(name = "userIduser",nullable = false)
    private User user;

    @Column(name = "overview",nullable = false)
    private String overview;

    @Column(name="popularidad",nullable = false)
    private String popularidad;

    @Column(name = "fechaLanzamiento")
    private String fechaLanzamiento;

}
