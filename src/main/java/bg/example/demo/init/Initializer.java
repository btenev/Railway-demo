package bg.example.demo.init;

import bg.example.demo.model.AddressEntity;
import bg.example.demo.model.UserEntity;
import bg.example.demo.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Initializer implements CommandLineRunner {
    private final UserRepository userRepository;

    public Initializer(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        AddressEntity madara = new AddressEntity("Madara Street", "10", "Haskovo");
        UserEntity john = new UserEntity(20, "John", "Jobless", madara);

        this.userRepository.save(john);
    }
}
