package co.edu.udea.geotruck.repository;


import co.edu.udea.geotruck.entity.Ruta;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RutaRepository extends CrudRepository<Ruta, Long> {
}
