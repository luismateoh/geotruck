package co.edu.udea.geotruck.repository;


import co.edu.udea.geotruck.entity.Vehiculo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehiculoRepository extends CrudRepository<Vehiculo, Long> {
}
