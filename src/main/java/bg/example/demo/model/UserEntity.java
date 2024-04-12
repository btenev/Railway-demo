package bg.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int age;

    private String name;

    private String occupation;
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private AddressEntity  addressEntity;

    public UserEntity(){
    }

    public UserEntity(int age, String name, String occupation, AddressEntity addressEntity) {
        this.age = age;
        this.name = name;
        this.occupation = occupation;
        this.addressEntity = addressEntity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public AddressEntity getAddressEntity() {
        return addressEntity;
    }

    public void setAddressEntity(AddressEntity addressEntity) {
        this.addressEntity = addressEntity;
    }
}
