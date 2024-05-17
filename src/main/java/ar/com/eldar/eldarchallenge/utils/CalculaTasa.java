package ar.com.eldar.eldarchallenge.utils;

import java.time.LocalDate;

import ar.com.eldar.eldarchallenge.entity.MarcaEntity;
import ar.com.eldar.eldarchallenge.exception.ChallengeException;

public class CalculaTasa {
    

    public Double calculaTasa(MarcaEntity marcaEntity, LocalDate fechaVencimiento, Double importe){
        Double tasa = 0.0;
        DateFormater date = new DateFormater();

        switch (marcaEntity.getMarca().toUpperCase()){
            case "VISA":
                tasa = date.getYear(fechaVencimiento) / (double) fechaVencimiento.getMonthValue();
                break;
            case "NARA":
                tasa = fechaVencimiento.getDayOfMonth() * 0.5;
                break;
            case "AMEX":
                tasa = fechaVencimiento.getMonthValue() * 0.1;
                break;
            default:
                throw new ChallengeException("Marca no es válida: " + marcaEntity.getMarca());
            
        }
        return (tasa * importe) / 100;


        
    }
}
