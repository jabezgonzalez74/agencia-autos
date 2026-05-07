/*

package com.agencia.agenciaautos.repository;

import com.agencia.agenciaautos.model.Marca;
import com.agencia.agenciaautos.repository.MarcaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/marcas")

public class MarcaController {

    @Autowired
    private MarcaRepository marcaRepository;

    @GetMapping
    public Page<Marca> listarMarcas(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {

        return marcaRepository.findAll(PageRequest.of(page, size));
    }
}
*/