package co.edu.udea.geotruck.dto;

import co.edu.udea.geotruck.constants.ValidatorConstants;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
public class VehiculoDto {


    private Long id;
    @NotNull
    @Pattern(regexp = ValidatorConstants.REGEX_PLACA)
    @Size(min = ValidatorConstants.MIN_SIZE_PLACA, max = ValidatorConstants.MAX_SIZE_PLACA, message = ValidatorConstants.BAD_FORMAT_PLACA)
    private String placa;
    @Size(min = ValidatorConstants.MIN_SIZE_TYPE, max = ValidatorConstants.MAX_SIZE_TYPE, message = ValidatorConstants.BAD_SIZE_TYPE_MESSSAGE)
    private String tipo;
    @Size(min = ValidatorConstants.MIN_SIZE_MARK, max = ValidatorConstants.MAX_SIZE_MARK, message = ValidatorConstants.BAD_SIZE_MARK_MESSSAGE)
    private String marca;
    @Pattern(regexp = ValidatorConstants.REGEX_MODEL, message = ValidatorConstants.BAD_FORMAT_MODEL)
    private int modelo;
    @Size(min = ValidatorConstants.MIN_SIZE_CAPACITY, max = ValidatorConstants.MAX_SIZE_CAPACITY, message = ValidatorConstants.BAD_SIZE_CAPACITY_MESSSAGE)
    private int capacidad;
    @Size(min = ValidatorConstants.MIN_SIZE_COLOR, max = ValidatorConstants.MAX_SIZE_COLOR, message = ValidatorConstants.BAD_SIZE_COLOR_MESSSAGE)
    private String color;
    @Pattern( regexp = ValidatorConstants.REGEX_LAT_LON, message = ValidatorConstants.BAD_FORMAT_LAT_LON)
    private String latitud;
    private String longitud;

}
