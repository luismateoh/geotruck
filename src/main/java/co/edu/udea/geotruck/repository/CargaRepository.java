package co.edu.udea.geotruck.repository;

import co.edu.udea.geotruck.entity.Carga;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CargaRepository extends CrudRepository<Carga, Long> {
}
