package co.edu.udea.geotruck.repository;


import co.edu.udea.geotruck.entity.Rol;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends CrudRepository<Rol, Long> {
}
