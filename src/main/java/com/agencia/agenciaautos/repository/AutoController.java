/*
package com.agencia.agenciaautos.repository;

import com.agencia.agenciaautos.model.Auto;
import com.agencia.agenciaautos.model.Auto;
import com.agencia.agenciaautos.repository.AutoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/autos")

public class AutoController {

    @Autowired
    private AutoRepository autoRepository;

    // POST
    @PostMapping
    public Auto guardar(@RequestBody Auto auto) {
        return autoRepository.save(auto);
    }

    // DELETE
    @DeleteMapping("/{noSerie}")
    public void eliminar(@PathVariable String noSerie) {
        autoRepository.deleteById(noSerie);
    }

    // GET marca
    @GetMapping("/marca/{nombre}")
    public List<com.agencia.agenciaautos.model.Auto> buscarMarca(@PathVariable String nombre) {
        return autoRepository.buscarPorMarca(nombre);
    }

    // GET filtro completo
    @GetMapping
    public List<com.agencia.agenciaautos.model.Auto> filtro(
            @RequestParam String marca,
            @RequestParam Double precioMin,
            @RequestParam Integer modelo) {

        return autoRepository.filtroCompleto(
                marca,
                precioMin,
                modelo
        );
    }
}
*/