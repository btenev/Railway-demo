package bg.example.demo.model.dto;

import bg.example.demo.model.AddressEntity;

public record UserDto(int age,
                      String name,
                      String occupation,
                      AddressDto addressDto) {
}
