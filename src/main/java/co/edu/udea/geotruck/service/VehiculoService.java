package co.edu.udea.geotruck.service;


import co.edu.udea.geotruck.dto.VehiculoDto;
import co.edu.udea.geotruck.entity.Vehiculo;
import co.edu.udea.geotruck.repository.VehiculoRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class VehiculoService {

    private final VehiculoRepository vehiculoRepository;

    private final ModelMapper modelMapper;


    public VehiculoService(VehiculoRepository vehiculoRepository, ModelMapper modelMapper) {
        this.vehiculoRepository = vehiculoRepository;
        this.modelMapper = modelMapper;
    }

    public VehiculoDto create(VehiculoDto vehiculoToCreateDto) {
        Vehiculo vehiculoToCreate = modelMapper.map(vehiculoToCreateDto, Vehiculo.class);
        Vehiculo result = vehiculoRepository.save(vehiculoToCreate);
        VehiculoDto resultDTO = modelMapper.map(result, VehiculoDto.class);
        return resultDTO;
    }

    public List<VehiculoDto> findAll() {
        List<Vehiculo> listItems = (List<Vehiculo>) vehiculoRepository.findAll();
        return listItems.stream()
                .map(vehiculo -> modelMapper.map(vehiculo, VehiculoDto.class))
                .collect(Collectors.toList());
    }

    public VehiculoDto findById(Long id) {
        Optional<Vehiculo> findVehiculoOptional = vehiculoRepository.findById(id);
        Vehiculo findVehiculo = findVehiculoOptional.orElseThrow(EntityNotFoundException::new);
        return modelMapper.map(findVehiculo, VehiculoDto.class);
    }

    public void delete(Long id) {
        VehiculoDto vehiculoInDb = findById(id);
        Vehiculo vehiculoToDelete = modelMapper.map(vehiculoInDb, Vehiculo.class);
        vehiculoRepository.delete(vehiculoToDelete);
    }

    public VehiculoDto update(VehiculoDto vehiculoDto) {
        findById(vehiculoDto.getId());
        return create(vehiculoDto);
    }


}
