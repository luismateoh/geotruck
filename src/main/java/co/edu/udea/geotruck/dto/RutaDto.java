package co.edu.udea.geotruck.dto;



import co.edu.udea.geotruck.constants.ValidatorConstants;
import lombok.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
public class RutaDto {

    private String ciudadDestino;
    private String ciudadOrigen;
    private Long id;
  

}
