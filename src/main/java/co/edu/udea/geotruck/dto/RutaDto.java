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

    @NotNull
    @Size(min = ValidatorConstants.MIN_SIZE_DESTINATIONCITY, max = ValidatorConstants.MAX_SIZE_DESTINATIONCITY, message = ValidatorConstants.BAD_SIZE_DESTINATIONCITY_MESSSAGE)
    private String ciudadDestino;
    @Size(min = ValidatorConstants.MIN_SIZE_ORIGINCITY, max = ValidatorConstants.MAX_SIZE_ORIGINCITY, message = ValidatorConstants.BAD_SIZE_ORIGINCITY_MESSSAGE)
    private String ciudadOrigen;
    private Long id;
  

}
