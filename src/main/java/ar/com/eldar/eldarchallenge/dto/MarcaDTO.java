package ar.com.eldar.eldarchallenge.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MarcaDTO {
    
    @NotNull
    @NotBlank(message = "marca es obligatrio")
    private String marca;
    private String descripcion;
}
