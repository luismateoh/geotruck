/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.geotruck.entity;

import javax.persistence.*;

/**
 * @author JOAN
 */

@Entity
@Table(name = "vehiculos")
public class Vehiculo {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String placa;

    @Column
    private String tipo;

    @Column
    private String marca;

    @Column
    private int modelo;

    @Column
    private int capacidad;

    @Column
    private String color;

    @Column
    private String latitud;

    @Column
    private String longitud;

    public Vehiculo() {
    }

    public Vehiculo(String placa, String tipo, String marca, int modelo, int capacidad, String color, String latitud, String longitud) {
        this.placa = placa;
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.capacidad = capacidad;
        this.color = color;
        this.latitud = latitud;
        this.longitud = longitud;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    
}
