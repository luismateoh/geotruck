/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udea.geotruck.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

/**
 *
 * @author JOAN
 */

@Data
@Builder
@AllArgsConstructor
@Entity
@Table(name = "cargas")
public class Carga {
    @Id
    @GeneratedValue
    private long id;
    @Column
    private String tipo;
    @Column
    private double peso;

    public Carga() {

    }
}
