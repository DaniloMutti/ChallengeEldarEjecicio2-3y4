package ar.com.eldar.eldarchallenge.service;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

import ar.com.eldar.eldarchallenge.dto.TasaDTO;
import ar.com.eldar.eldarchallenge.dto.TasaRequestDTO;
import ar.com.eldar.eldarchallenge.entity.MarcaEntity;
import ar.com.eldar.eldarchallenge.utils.CalculaTasa;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TasaService {
    private final MarcaService marcaService;

    public TasaDTO getTasa(TasaRequestDTO tasaRequest){
        CalculaTasa calcTasa = new CalculaTasa();
        MarcaEntity marca = marcaService.getMarca(tasaRequest.getMarca());


        return TasaDTO.builder()
                            .marcaInformada(marca.getMarca())
                            .importeInformado(tasaRequest.getImporte())
                            .descripcionTasa(marca.getDescripcion())
                            .tasa(calcTasa.calculaTasa(marca, LocalDate.now(), tasaRequest.getImporte()))
                        .build();

    }
}
