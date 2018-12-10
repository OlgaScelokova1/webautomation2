package General;


import lombok.Data;

import static utils.RandomGenerator.generateRandomEmail;
import static utils.RandomGenerator.generateRandomPhoneNumber;
import static utils.RandomGenerator.generateRandomString;

@Data
public class User {
    private String firstName;
    private String lastName;
    private String mobileNumber;
    private String emailAddress;
    private String company;
    private String message;

    public User(){
        this.firstName = generateRandomString();
        this.lastName = generateRandomString();
        this.mobileNumber = generateRandomPhoneNumber();
        this.emailAddress = generateRandomEmail();
        this.company = generateRandomString();
        this.message = generateRandomString();
    }

    public User(String firstname, String lastname){
        this.firstName = firstname;
        this.lastName = lastname;
    }
}