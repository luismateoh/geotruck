package co.edu.udea.geotruck.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class VehiculoDto {

    private Long id;

    private String placa;

    private String tipo;

    private String marca;

    private int modelo;

    private int capacidad;

    private String color;

    private String latitud;

    private String longitud;

}
