package co.edu.udea.geotruck.service;


import co.edu.udea.geotruck.dto.UsuarioDto;
import co.edu.udea.geotruck.entity.Usuario;
import co.edu.udea.geotruck.repository.UsuarioRepository;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UsuarioService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UsuarioService.class);

    private final UsuarioRepository usuarioRepository;

    private final ModelMapper modelMapper;


    public UsuarioService(UsuarioRepository usuarioRepository, ModelMapper modelMapper) {
        this.usuarioRepository = usuarioRepository;
        this.modelMapper = modelMapper;
    }

    public UsuarioDto create(UsuarioDto userToCreateDto) {
        Usuario usuarioToCreate = modelMapper.map(userToCreateDto, Usuario.class);
        Usuario result = usuarioRepository.save(usuarioToCreate);
        UsuarioDto resultDTO = modelMapper.map(result, UsuarioDto.class);
        return resultDTO;
    }

    public List<UsuarioDto> findAll() {
        List<Usuario> listItems = (List<Usuario>) usuarioRepository.findAll();
        return listItems.stream()
                .map(usuario -> modelMapper.map(usuario, UsuarioDto.class))
                .collect(Collectors.toList());
    }

    public UsuarioDto findById(Long id) {
        Optional<Usuario> findPersonOptional = usuarioRepository.findById(id);
        Usuario findUsuario = findPersonOptional.orElseThrow(EntityNotFoundException::new);
        return modelMapper.map(findUsuario, UsuarioDto.class);
    }

    public void delete(Long id) {
        UsuarioDto personInDb = findById(id);
        Usuario usuarioToDelete = modelMapper.map(personInDb, Usuario.class);
        usuarioRepository.delete(usuarioToDelete);
    }

    public UsuarioDto update(UsuarioDto usuarioDto) {
        findById(usuarioDto.getId());
        return create(usuarioDto);
    }


}
