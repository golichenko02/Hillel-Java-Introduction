package parser;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Human {
    @JsonProperty("firstName")
    private String firstName;

    @JsonProperty("lastName")
    private String lastName;

    @JsonProperty("age")
    private Integer age;

    @JsonProperty("contacts")
    private Contacts contacts;

    @JsonProperty("address")
    private Address address;

}
