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
    private int idUsuario;
    private String nameRol;
   
}
