package ironcoding.mongoapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Address {
    private String country;
    private String state;
    private String city;
    private String postCode;
}
