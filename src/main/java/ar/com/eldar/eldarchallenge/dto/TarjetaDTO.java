package ar.com.eldar.eldarchallenge.dto;



import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TarjetaDTO {
   
      
    @NotNull
    @NotBlank(message = "marca es obligatrio")
    private String marca;
    
    @NotNull
    @NotBlank(message = "numero de tarjeta es obligatrio")
    private String numTarjeta;
    
    @NotNull
    @NotBlank(message = "nombre y apellido son obligatrio")
    private String cardholder;
    
    @NotNull
    @NotBlank(message = "fecha de vencimento es obligatrio")
    private String fechaVencimento;

    private Double tasa;
    private Boolean valida;
    private Boolean validaOperar;
    


    
}
