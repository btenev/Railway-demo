package bg.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "addresses")
public class AddressEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String streetName;

    private String streetNumber;

    private String town;

    public AddressEntity(String streetName, String streetNumber, String town) {
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.town = town;
    }

    public AddressEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }
}
