package com.agencia.agenciaautos.controller;

import com.agencia.agenciaautos.model.Marca;
import com.agencia.agenciaautos.repository.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

@RestController
@RequestMapping("/api/marcas")
public class MarcaController {

    @Autowired
    private MarcaRepository marcaRepository;

    // LISTAR
   @GetMapping
    public Page<Marca> listarMarcas(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size){

        return marcaRepository.findAll(PageRequest.of(page, size));
    }

    // GUARDAR
    @PostMapping
    public Marca guardarMarca(@RequestBody Marca marca) {
        return marcaRepository.save(marca);
    }

    // ELIMINAR
    @DeleteMapping("/{id}")
    public void eliminarMarca(@PathVariable Integer id) {
        marcaRepository.deleteById(id);
    }
}