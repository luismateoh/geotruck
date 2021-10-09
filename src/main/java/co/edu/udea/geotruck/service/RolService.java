package co.edu.udea.geotruck.service;


import co.edu.udea.geotruck.dto.RolDto;
import co.edu.udea.geotruck.entity.Rol;
import co.edu.udea.geotruck.repository.RolRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class RolService {

    private final RolRepository rolRepository;

    private final ModelMapper modelMapper;


    public RolService(RolRepository rolRepository, ModelMapper modelMapper) {
        this.rolRepository = rolRepository;
        this.modelMapper = modelMapper;
    }

    public RolDto create(RolDto rolToCreateDto) {
        Rol rolToCreate = modelMapper.map(rolToCreateDto, Rol.class);
        Rol result = rolRepository.save(rolToCreate);
        RolDto resultDTO = modelMapper.map(result, RolDto.class);
        return resultDTO;
    }

    public List<RolDto> findAll() {
        List<Rol> listItems = (List<Rol>) rolRepository.findAll();
        return listItems.stream()
                .map(rol -> modelMapper.map(rol, RolDto.class))
                .collect(Collectors.toList());
    }

    public RolDto findById(Long id) {
        Optional<Rol> findRolOptional = rolRepository.findById(id);
        Rol findRol = findRolOptional.orElseThrow(EntityNotFoundException::new);
        return modelMapper.map(findRol, RolDto.class);
    }

    public void delete(Long id) {
        RolDto rolInDb = findById(id);
        Rol rolToDelete = modelMapper.map(rolInDb, Rol.class);
        rolRepository.delete(rolToDelete);
    }

    public RolDto update(RolDto rolDto) {
        findById(rolDto.getId());
        return create(rolDto);
    }


}
