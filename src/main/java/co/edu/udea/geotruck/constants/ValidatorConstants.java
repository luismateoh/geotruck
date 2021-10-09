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

    public static final int MIN_SIZE_TYPE = 2;
    public static final int MAX_SIZE_TYPE = 15;

    public static final int MIN_SIZE_MARK = 2;
    public static final int MAX_SIZE_MARK = 15;

    public static final int MIN_SIZE_CAPACITY = 1;
    public static final int MAX_SIZE_CAPACITY = 2;

    public static final int MIN_SIZE_COLOR = 3;
    public static final int MAX_SIZE_COLOR = 10;

    public static final int MIN_SIZE_DESTINATIONCITY = 3;
    public static final int MAX_SIZE_DESTINATIONCITY = 20;

    public static final int MIN_SIZE_ORIGINCITY = 3;
    public static final int MAX_SIZE_ORIGINCITY = 20;

    public static final int MIN_SIZE_PESO = 1;
    public static final int MAX_SIZE_PESO = 2;



    //Placas colombia
    public static final String REGEX_PLACA =
            "^([A-Z]{3}\\d{3}|[A-Z]{2}\\d{4}|[A-Z]{2}\\d{3}[A-Z]|[A-Z]\\d{4,5})$";
    public static final int MIN_SIZE_PLACA = 6;
    public static final int MAX_SIZE_PLACA = 6;

    //Año de 1900 a 2099
    public static final String REGEX_MODEL =
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
    public static final String BAD_SIZE_LASTNAME_MESSSAGE = "Last name must be between 1 and 25 characters";
    public static final String BAD_SIZE_TYPE_MESSSAGE = "Type must be between 2 and 15 characters";
    public static final String BAD_SIZE_MARK_MESSSAGE = "Mark must be between 2 and 15 characters";
    public static final String BAD_SIZE_CAPACITY_MESSSAGE = "Capacity must be between 1 and 2 characters";
    public static final String BAD_SIZE_COLOR_MESSSAGE = "Color must be between 3 and 10 characters";
    public static final String BAD_SIZE_DESTINATIONCITY_MESSSAGE = "Destination city must be between 3 and 20 characters";
    public static final String BAD_SIZE_ORIGINCITY_MESSSAGE = "Origin city must be between 3 and 20 characters";
    public static final String BAD_SIZE_PESO_MESSSAGE = "Peso must be between 1 and 2 characters";
    public static final String BAD_FORMAT_PLACA = "plate bad format";
    public static final String BAD_FORMAT_MODEL = "model out of range";
    public static final String BAD_FORMAT_LAT_LON= "latitude and longitude bad format";
}
