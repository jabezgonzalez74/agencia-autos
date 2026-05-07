package com.agencia.agenciaautos.controller;

import com.agencia.agenciaautos.model.Auto;
import com.agencia.agenciaautos.repository.AutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/autos")
public class AutoController {

    @Autowired
    private AutoRepository autoRepository;

    // METODO 4
    @GetMapping("/marca/{nombre}")
    public List<Auto> buscarMarca(
            @PathVariable String nombre){

        return autoRepository.buscarPorMarca(nombre);
    }

    // METODO 5
    @GetMapping
    public List<Auto> filtrar(
            @RequestParam String marca,
            @RequestParam Double precioMin,
            @RequestParam Integer modelo){

        return autoRepository.filtrar(
                marca,
                precioMin,
                modelo);
    }

    // METODO 3
    @PostMapping
    public Auto guardar(@RequestBody Auto auto){

        return autoRepository.save(auto);
    }

    // METODO 2
    @DeleteMapping("/{noSerie}")
    public void eliminar(@PathVariable String noSerie){

        autoRepository.deleteById(noSerie);
    }
}