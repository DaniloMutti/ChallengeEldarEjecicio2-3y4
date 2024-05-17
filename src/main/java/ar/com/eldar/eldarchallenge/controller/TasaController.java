package ar.com.eldar.eldarchallenge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.eldar.eldarchallenge.dto.TasaDTO;
import ar.com.eldar.eldarchallenge.dto.TasaRequestDTO;
import ar.com.eldar.eldarchallenge.service.TasaService;

@RestController
@RequestMapping("ejecicio2")
public class TasaController {
    @Autowired
    private TasaService tasaService;

    @GetMapping("/getTasa")
    public TasaDTO getTasa(@RequestBody TasaRequestDTO tasaRequest){
        return tasaService.getTasa(tasaRequest);
    }
}
