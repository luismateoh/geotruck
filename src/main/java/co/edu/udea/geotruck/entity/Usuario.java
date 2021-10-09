package co.edu.udea.geotruck.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(exclude = {"nombre", "email", "apellido", "password"})
@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private Long identificacion;

    @Column
    private String email;

    @Column
    private String password;

    @Column
    private String nombre;

    @Column
    private String apellido;

    @OneToMany(mappedBy = "usuario")
    private List<Vehiculo> vehiculos;

    @ManyToOne
    @JoinColumn(name = "rol_id")
    private Rol rol;
}
