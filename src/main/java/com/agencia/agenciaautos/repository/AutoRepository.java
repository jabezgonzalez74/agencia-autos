/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.agencia.agenciaautos.repository;

import com.agencia.agenciaautos.model.Auto;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Query;

public interface AutoRepository extends JpaRepository<Auto, String> {

    @Query("""
SELECT a FROM Auto a
WHERE lower(a.marca.nombre)=lower(:nombre)
""")
    List<Auto> buscarPorMarca(@Param("nombre") String nombre);

    @Query("""
SELECT a FROM Auto a
WHERE lower(a.marca.nombre)=lower(:marca)
AND a.precio >= :precioMin
AND a.modelo >= :modelo
""")
List<Auto> filtrar(
        @Param("marca") String marca,
        @Param("precioMin") Double precioMin,
        @Param("modelo") Integer modelo);

}
