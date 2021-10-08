package co.edu.udea.geotruck.service;


import co.edu.udea.geotruck.dto.UserDto;
import co.edu.udea.geotruck.entity.User;
import co.edu.udea.geotruck.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserService.class);

    private UserRepository userRepository;

    private ModelMapper modelMapper;


    public UserService(UserRepository userRepository, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.modelMapper = modelMapper;
    }

    public UserDto create(UserDto personToCreateDto) {
        LOGGER.debug("Begin create: personToCreateDto={}", personToCreateDto);

        User userToCreate = modelMapper.map(personToCreateDto, User.class);
        User result = userRepository.save(userToCreate);
        UserDto resultDTO = modelMapper.map(result, UserDto.class);

        LOGGER.debug("End create: resultDTO={}", resultDTO);
        return resultDTO;
    }

    public List<UserDto> findAll() {
        List<User> listPeople = (List<User>) userRepository.findAll();
        return listPeople.stream()
                .map(user -> modelMapper.map(user, UserDto.class))
                .collect(Collectors.toList());
    }

    public UserDto findById(Long id) {
        Optional<User> findPersonOptional = userRepository.findById(id);
        User findUser = findPersonOptional.orElseThrow(EntityNotFoundException::new);
        return modelMapper.map(findUser, UserDto.class);
    }

    public void delete(Long id) {
        UserDto personInDb = findById(id);
        User userToDelete = modelMapper.map(personInDb, User.class);
        userRepository.delete(userToDelete);
    }

    public UserDto update(UserDto userDto) {
        findById(userDto.getId());
        return create(userDto);
    }


}
