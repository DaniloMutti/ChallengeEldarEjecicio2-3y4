package ar.com.eldar.eldarchallenge.service;


import org.springframework.stereotype.Service;

import ar.com.eldar.eldarchallenge.dto.TarjetaDTO;

import ar.com.eldar.eldarchallenge.repository.TarjetaRepository;
import ar.com.eldar.eldarchallenge.utils.CalculaTasa;
import ar.com.eldar.eldarchallenge.utils.DateFormater;
import ar.com.eldar.eldarchallenge.utils.Validaciones;
import ar.com.eldar.eldarchallenge.entity.TarjetaEntity;
import ar.com.eldar.eldarchallenge.exception.ChallengeException;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TarjetaService {
    private final TarjetaRepository tarjetaRepository;
    private final MarcaService marcaService;



    public TarjetaDTO getTarjeta(String numeroTarjeta, Double importe){
        DateFormater fecha = new DateFormater();
        Validaciones validaciones = new Validaciones();
        TarjetaEntity tarjeta = tarjetaRepository.findByNumeroTarjeta(numeroTarjeta)
                            .orElseThrow(()-> new ChallengeException("Tarjeta no encontrada"));

        CalculaTasa calculaTasa = new CalculaTasa();
       
        return TarjetaDTO.builder()
                    .marca(tarjeta.getMarca().getMarca())
                    .numTarjeta(tarjeta.getNumeroTarjeta())
                    .cardholder(tarjeta.getCardholder())
                    .fechaVencimento(fecha.fechaFormat(tarjeta.getFechaVencimento()))
                    .tasa(calculaTasa.calculaTasa(tarjeta.getMarca(), tarjeta.getFechaVencimento(), importe))
                    .valida(validaciones.operacionValida(importe))
                    .validaOperar(validaciones.tarjetaValida(tarjeta))

                    .build();
    }

    public void nuevaTarjeta(TarjetaDTO tarjeta){
       if(tarjetaRepository.findByNumeroTarjeta(tarjeta.getNumTarjeta()).isPresent()){
            throw new ChallengeException("Tarjeta ya registrada");
       } 
       DateFormater fecha = new DateFormater();
      
       try {
            tarjetaRepository.save(TarjetaEntity.builder()
                                        .numeroTarjeta(tarjeta.getNumTarjeta())
                                        .cardholder(tarjeta.getCardholder())
                                        .fechaVencimento(fecha.toLocalDate(tarjeta.getFechaVencimento()))
                                        .marca(marcaService.getMarca(tarjeta.getMarca()))
                                    .build());   
        } catch (Exception e) {
            throw new ChallengeException("No fue posible guardar la tarjeta");
          
        }
        
    }




    
}
