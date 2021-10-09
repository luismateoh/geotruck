package co.edu.udea.geotruck.dto;



import co.edu.udea.geotruck.constants.ValidatorConstants;
import lombok.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
public class RolDto {

    private Long id;

    @Size(min = ValidatorConstants.MIN_SIZE_ID, max = ValidatorConstants.MAX_SIZE_ID, message = ValidatorConstants.BAD_SIZE_ID_MESSSAGE)
    private int idUsuario;
    @Size(min = ValidatorConstants.MIN_SIZE_NAME, max = ValidatorConstants.MAX_SIZE_NAME, message = ValidatorConstants.BAD_SIZE_NAME_MESSSAGE)
    private String nameRol;
   
}
