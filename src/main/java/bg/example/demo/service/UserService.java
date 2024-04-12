package bg.example.demo.service;

import bg.example.demo.model.AddressEntity;
import bg.example.demo.model.UserEntity;
import bg.example.demo.model.dto.AddressDto;
import bg.example.demo.model.dto.UserDto;
import bg.example.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserDto getById(Long id) {
        UserEntity byId = this.userRepository.findById(id).get();
        AddressEntity addressEntity = byId.getAddressEntity();

        AddressDto address = new AddressDto(addressEntity.getStreetName(), addressEntity.getStreetNumber(), addressEntity.getTown());

        return new UserDto(byId.getAge(), byId.getName(), byId.getOccupation(), address);
    }
}
