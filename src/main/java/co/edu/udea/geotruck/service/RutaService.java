package co.edu.udea.geotruck.service;

import co.edu.udea.geotruck.repository.RutaRepository;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class RutaService {

    private static final Logger LOGGER = LoggerFactory.getLogger(RutaService.class);

    private final RutaRepository rutaRepository;

    private final ModelMapper modelMapper;


    public RutaService(RutaRepository rutaRepository, ModelMapper modelMapper) {
        this.rutaRepository = rutaRepository;
        this.modelMapper = modelMapper;
    }

    public RutaDto create(RutaDto rutaToCreateDto) {
        Ruta rutaToCreate = modelMapper.map(rutaToCreateDto, Ruta.class);
        Ruta result = rutaRepository.save(rutaToCreate);
        RutaDto resultDTO = modelMapper.map(result, RutaDto.class);
        return resultDTO;
    }

    public List<RutaDto> findAll() {
        List<Ruta> listItems = (List<Ruta>) rutaRepository.findAll();
        return listItems.stream()
                .map(ruta -> modelMapper.map(ruta, RutaDto.class))
                .collect(Collectors.toList());
    }

    public RutaDto findById(Long id) {
        Optional<Ruta> findRutaOptional = rutaRepository.findById(id);
        Ruta findRuta = findRutaOptional.orElseThrow(EntityNotFoundException::new);
        return modelMapper.map(findRuta, RutaDto.class);
    }

    public void delete(Long id) {
        RutaDto rutaInDb = findById(id);
        Ruta rutaToDelete = modelMapper.map(rutaInDb, Ruta.class);
        rutaRepository.delete(rutaToDelete);
    }

    public RutaDto update(RutaDto rutaDto) {
        findById(rutaDto.getId());
        return create(rutaDto);
    }


}
