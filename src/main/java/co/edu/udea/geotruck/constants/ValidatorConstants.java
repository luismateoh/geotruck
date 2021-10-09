package co.edu.udea.geotruck.constants;

public class ValidatorConstants {
    //Validators
    public static final String REGEX_EMAIL =
            "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    public static final int MIN_SIZE_EMAIL = 5;
    public static final int MAX_SIZE_EMAIL = 50;

    public static final int MIN_SIZE_NAME = 5;
    public static final int MAX_SIZE_NAME = 50;

    public static final int MIN_SIZE_PASSWORD = 8;
    public static final int MAX_SIZE_PASSWORD = 15;

    public static final int MIN_SIZE_ID = 5;
    public static final int MAX_SIZE_ID = 12;

    public static final int MIN_SIZE_LASTNAME = 1;
    public static final int MAX_SIZE_LASTNAME = 25;

    //Placas colombia
    public static final String REGEX_PLACA =
            "^([A-Z]{3}\\d{3}|[A-Z]{2}\\d{4}|[A-Z]{2}\\d{3}[A-Z]|[A-Z]\\d{4,5})$";
    public static final int MIN_SIZE_PLACA = 6;
    public static final int MAX_SIZE_PLACA = 6;

    //Año de 1900 a 2099
    public static final String REGEX_MODELO =
            "^(19|20)\\d{2}$";

    //Latitud y Longitud
    public static final String REGEX_LAT_LON =
            "^(-?\\d+(\\.\\d+)?),\\s*(-?\\d+(\\.\\d+)?)$";

    //Messages
    public static final String BAD_FORMAT_EMAIL_MESSSAGE = "Email bad format";
    public static final String BAD_SIZE_EMAIL_MESSSAGE = "email must be between 5 and 20 characters";
    public static final String BAD_SIZE_PASSWORD_MESSAGE = "password must be between 8 and 15 characters";
    public static final String BAD_SIZE_NAME_MESSSAGE = "name must be between 5 and 20 characters";
    public static final String BAD_SIZE_ID_MESSSAGE = "ID must be between 5 and 12 characters";
    public static final String BAD_SIZE_LASTNAME_MESSSAGE = "ID must be between 1 and 25 characters";
    public static final String BAD_FORMAT_PLACA = "plate bad format";
    public static final String BAD_FORMAT_MODELO = "model out of range";
    public static final String BAD_FORMAT_LAT_LON= "latitude and longitude bad format";
}
