package com.tryingrestapi.demo.model;
import javax.persistence.*;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Entity
public class Author {
    public static final PasswordEncoder PASSWORD_ENCODER = new BCryptPasswordEncoder();
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String userName;
    private String password;

    public Author() {
        super();
    }

    public Author(String firstName, String lastName, String userName, String password) {
        this();
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        setPassword(password);
    }

    public void setPassword(String password){
        this.password = PASSWORD_ENCODER.encode(password);
    }

    //    getters and setters


    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public boolean equals(Object o){
        Author inputAuthor = (Author) o;

        if(!this.firstName.equals(inputAuthor.getFirstName())){
            System.out.println("Firstname not equal");
            return false;
        }
        if(!this.lastName.equals(inputAuthor.getLastName())){
            System.out.println("LastName not equal");
            return false;
        }
        if (!this.userName.equals(inputAuthor.getUserName())){
            System.out.println("UserName not equal");
            return false;
        }

        return true;
    }

}
