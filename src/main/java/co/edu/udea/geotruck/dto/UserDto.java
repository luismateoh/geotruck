package co.edu.udea.geotruck.dto;



import co.edu.udea.geotruck.constants.ValidatorConstants;
import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
@Builder
public class UserDto {

    private Long id;

    @NotNull
    @Size(min = ValidatorConstants.MIN_SIZE_EMAIL, max = ValidatorConstants.MAX_SIZE_EMAIL, message = ValidatorConstants.BAD_SIZE_EMAIL_MESSSAGE)
    @Pattern(regexp = ValidatorConstants.REGEX_EMAIL, message = ValidatorConstants.BAD_FORMAT_EMAIL_MESSSAGE)
    private String email;

    @NotNull
    @Size(min = ValidatorConstants.MIN_SIZE_PASSWORD, max = ValidatorConstants.MAX_SIZE_PASSWORD, message = ValidatorConstants.BAD_SIZE_PASSWORD_MESSAGE)
    private String password;
    @Size(min = ValidatorConstants.MIN_SIZE_NAME, max = ValidatorConstants.MAX_SIZE_NAME, message = ValidatorConstants.BAD_SIZE_NAME_MESSSAGE)
    private String name;

}
