/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.agencia.agenciaautos.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "marca")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Marca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMarca;

    private String nombre;

    private String pais;
}