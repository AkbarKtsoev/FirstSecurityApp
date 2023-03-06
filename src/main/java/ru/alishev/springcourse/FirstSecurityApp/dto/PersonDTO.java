package ru.alishev.springcourse.FirstSecurityApp.dto;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class PersonDTO {
    @NotEmpty(message = "Name should not be empty")
    @Size(min = 2,max=100,message = "Name's length should be more than 2 and less than 100 charectars")
    private String username;


    private String password;

    private int yearOfBirth;


    public String getUsername1() {
        return username;
    }

    public void setUsername1(String username) {
        this.username = username;
    }

    public String getPassword1() {
        return password;
    }

    public void setPassword1(String password) {
        this.password = password;
    }

    public int getYearOfBirth1() {
        return yearOfBirth;
    }

    public void setYearOfBirth1(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
}
