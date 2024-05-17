package ar.com.eldar.eldarchallenge.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TasaDTO {
    private String marcaInformada;
    private Double importeInformado;
    private String descripcionTasa;
    private Double tasa;

}
