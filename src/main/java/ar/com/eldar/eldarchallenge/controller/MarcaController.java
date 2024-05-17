package ar.com.eldar.eldarchallenge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.eldar.eldarchallenge.dto.MarcaDTO;
import ar.com.eldar.eldarchallenge.service.MarcaService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/config")
public class MarcaController {
    @Autowired
    private MarcaService marcaService;

    @PostMapping("nuevaMarca")
    public void nuevaMarca(@Valid @RequestBody MarcaDTO marca){
        marcaService.nuevaMarca(marca);
    }
}
