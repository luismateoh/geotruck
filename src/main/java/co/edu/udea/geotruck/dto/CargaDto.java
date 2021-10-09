package co.edu.udea.geotruck.dto;



import co.edu.udea.geotruck.constants.ValidatorConstants;
import lombok.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
public class CargaDto {

    private Long id;

    @Size(min = ValidatorConstants.MIN_SIZE_PESO, max = ValidatorConstants.MAX_SIZE_PESO, message = ValidatorConstants.BAD_SIZE_PESO_MESSSAGE)
    private double peso;
    @Size(min = ValidatorConstants.MIN_SIZE_TYPE, max = ValidatorConstants.MAX_SIZE_TYPE, message = ValidatorConstants.BAD_SIZE_TYPE_MESSSAGE)
    private String tipo;    
    
}
