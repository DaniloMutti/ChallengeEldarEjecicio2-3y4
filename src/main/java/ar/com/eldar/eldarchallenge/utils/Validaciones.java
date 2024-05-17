package ar.com.eldar.eldarchallenge.utils;

import java.time.LocalDate;

import ar.com.eldar.eldarchallenge.entity.TarjetaEntity;

public class Validaciones {
    
    public Boolean operacionValida(Double importe){
        if(importe < 1000) return true;
        
        return false;
    }

    public Boolean tarjetaValida(TarjetaEntity tarjeta){
        if(tarjeta.getFechaVencimento().isAfter(LocalDate.now())) return true;

        return false;
    }
}
