package bg.example.demo.web;

import bg.example.demo.model.dto.UserDto;
import bg.example.demo.service.UserService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<UserDto> getUser(@PathVariable Long id) {
        UserDto byId = this.userService.getById(id);

        return ResponseEntity.ok(byId);
    }

}
