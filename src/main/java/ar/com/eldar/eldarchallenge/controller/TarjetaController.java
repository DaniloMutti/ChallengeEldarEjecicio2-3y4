package ar.com.eldar.eldarchallenge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.eldar.eldarchallenge.dto.TarjetaDTO;
import ar.com.eldar.eldarchallenge.service.TarjetaService;
import jakarta.validation.Valid;

@RestController
@RequestMapping()
public class TarjetaController {
    @Autowired
    private TarjetaService tarjetaService;

    @PostMapping("config/nuevaTarjeta")
    public void nuevaTarjeta(@Valid @RequestBody TarjetaDTO tarjeta){
        tarjetaService.nuevaTarjeta(tarjeta);
    }

    @GetMapping("getTarjeta/{numTarjeta}/{importe}")
    public TarjetaDTO getTarjeta(@PathVariable String numTarjeta, @PathVariable Double importe){
        return tarjetaService.getTarjeta(numTarjeta, importe);
    }
    
}
