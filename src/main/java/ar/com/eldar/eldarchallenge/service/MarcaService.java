package ar.com.eldar.eldarchallenge.service;

import org.springframework.stereotype.Service;

import ar.com.eldar.eldarchallenge.dto.MarcaDTO;
import ar.com.eldar.eldarchallenge.entity.MarcaEntity;
import ar.com.eldar.eldarchallenge.exception.ChallengeException;
import ar.com.eldar.eldarchallenge.repository.MarcaRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MarcaService {
    private final MarcaRepository marcaRepository;

    public void nuevaMarca(MarcaDTO marca){
        
        if(marcaRepository.findByMarca(marca.getMarca()).isPresent()){
            throw new ChallengeException("Marca existente");
        }
        try {
            marcaRepository.save(MarcaEntity.builder()
                                    .marca(marca.getMarca().toUpperCase())
                                    .descripcion(marca.getDescripcion())
                                .build()
            );
        } catch (Exception e) {
            throw new ChallengeException("No fue posible guardar la operacion");
        }
    }

    public MarcaEntity getMarca(String marca){
                
        return marcaRepository.findByMarca(marca.toUpperCase())
                    .orElseThrow(() -> new ChallengeException("Marca no existente"));
    }

    
}
