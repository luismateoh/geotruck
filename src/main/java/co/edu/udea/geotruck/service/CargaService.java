package co.edu.udea.geotruck.service;

import co.edu.udea.geotruck.dto.CargaDto;
import co.edu.udea.geotruck.entity.Carga;
import co.edu.udea.geotruck.repository.CargaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CargaService {

    private final CargaRepository cargaRepository;

    private final ModelMapper modelMapper;


    public CargaService(CargaRepository cargaRepository, ModelMapper modelMapper) {
        this.cargaRepository = cargaRepository;
        this.modelMapper = modelMapper;
    }

    public CargaDto create(CargaDto cargaToCreateDto) {
        Carga cargaToCreate = modelMapper.map(cargaToCreateDto, Carga.class);
        Carga result = cargaRepository.save(cargaToCreate);
        CargaDto resultDTO = modelMapper.map(result, CargaDto.class);
        return resultDTO;
    }

    public List<CargaDto> findAll() {
        List<Carga> listItems = (List<Carga>) cargaRepository.findAll();
        return listItems.stream()
                .map(carga -> modelMapper.map(carga, CargaDto.class))
                .collect(Collectors.toList());
    }

    public CargaDto findById(Long id) {
        Optional<Carga> findCargaOptional = cargaRepository.findById(id);
        Carga findCarga = findCargaOptional.orElseThrow(EntityNotFoundException::new);
        return modelMapper.map(findCarga, CargaDto.class);
    }

    public void delete(Long id) {
        CargaDto cargaInDb = findById(id);
        Carga cargaToDelete = modelMapper.map(cargaInDb, Carga.class);
        cargaRepository.delete(cargaToDelete);
    }

    public CargaDto update(CargaDto cargaDto) {
        findById(cargaDto.getId());
        return create(cargaDto);
    }


}
