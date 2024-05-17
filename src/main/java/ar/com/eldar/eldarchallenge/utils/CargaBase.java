package ar.com.eldar.eldarchallenge.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.eldar.eldarchallenge.dto.MarcaDTO;
import ar.com.eldar.eldarchallenge.dto.TarjetaDTO;
import ar.com.eldar.eldarchallenge.exception.ChallengeException;
import ar.com.eldar.eldarchallenge.service.MarcaService;
import ar.com.eldar.eldarchallenge.service.TarjetaService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CargaBase {
    @Autowired
    private final TarjetaService tarjetaService;
    @Autowired
    private final MarcaService marcaService;

    public void cargaBaseInicial(){
        MarcaDTO marca = MarcaDTO.builder()
                                    .marca("VISA")
                                    .descripcion("AÑO / MES")
                                .build();
        try {
            marcaService.nuevaMarca(marca);
        } catch (Exception e) {
            throw new ChallengeException("Error al guardar marca");
        }
        marca = MarcaDTO.builder()
                         .marca("NARA")
                         .descripcion("DIA DEL MES * 0.5")
                        .build();
        try {
            marcaService.nuevaMarca(marca);
        } catch (Exception e) {
            throw new ChallengeException("Error al guardar marca");
        }
        marca = MarcaDTO.builder()
                         .marca("AMEX")
                         .descripcion("MES * 0.1")
                        .build();
        try {
            marcaService.nuevaMarca(marca);
        } catch (Exception e) {
            throw new ChallengeException("Error al guardar marca");
        }



        TarjetaDTO tarjeta = TarjetaDTO.builder()
                                            .marca("VISA")
                                            .numTarjeta("111444")
                                            .cardholder("DANILO MUTTI")
                                            .fechaVencimento("2030-12-05")
                                        .build();

        try {
            tarjetaService.nuevaTarjeta(tarjeta);
        } catch (Exception e) {
            throw new ChallengeException("Error al guardar tarjeta");
        }

        tarjeta = TarjetaDTO.builder()
                                .marca("VISA")
                                .numTarjeta("111445")
                                .cardholder("MAURO MUTTI")
                                .fechaVencimento("2025-12-21")
                            .build();

        try {
            tarjetaService.nuevaTarjeta(tarjeta);
        } catch (Exception e) {
            throw new ChallengeException("Error al guardar tarjeta");
        }

        tarjeta = TarjetaDTO.builder()
                                .marca("NARA")
                                .numTarjeta("222555")
                                .cardholder("JUAN CARLOS")
                                .fechaVencimento("2026-12-30")
                            .build();

        try {
            tarjetaService.nuevaTarjeta(tarjeta);
        } catch (Exception e) {
            throw new ChallengeException("Error al guardar tarjeta");
        }

        tarjeta = TarjetaDTO.builder()
                                .marca("NARA")
                                .numTarjeta("222556")
                                .cardholder("MATIAS MATI")
                                .fechaVencimento("2024-05-21")
                            .build();

        try {
            tarjetaService.nuevaTarjeta(tarjeta);
        } catch (Exception e) {
            throw new ChallengeException("Error al guardar tarjeta");
        }

        tarjeta = TarjetaDTO.builder()
                                .marca("AMEX")
                                .numTarjeta("333666")
                                .cardholder("GRACIELA BRUNO")
                                .fechaVencimento("2024-06-10")
                            .build();

        try {
            tarjetaService.nuevaTarjeta(tarjeta);
        } catch (Exception e) {
            throw new ChallengeException("Error al guardar tarjeta");
        }

        tarjeta = TarjetaDTO.builder()
                                .marca("AMEX")
                                .numTarjeta("333667")
                                .cardholder("PEDRO PIMENTEL")
                                .fechaVencimento("2024-03-10")
                            .build();

        try {
            tarjetaService.nuevaTarjeta(tarjeta);
        } catch (Exception e) {
            throw new ChallengeException("Error al guardar tarjeta");
        }


    }
    
}
