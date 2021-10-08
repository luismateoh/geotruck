/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.geotruck.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

/**
 *
 * @author JOAN
 */
@Data
@Builder
@Entity
@Table(name = "users")
public class Ruta {
    @Id
    @GeneratedValue
    private long id;

    @Column
    private String ciudadOrigen;

    @Column
    private String ciudadDestino;

    public Ruta() {

    }
}
