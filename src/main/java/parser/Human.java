package parser;

import lombok.Data;

@Data
public class Human {

    private String firstName;

    private String lastName;

    private Integer age;

    private Contacts contacts;

    private Address address;

}
