package ru.alishev.springcourse.FirstSecurityApp.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class AuthenticationDTO {
    @NotEmpty(message = "Name should not be empty")
    @Size(min = 2,max=100,message = "Name's length should be more than 2 and less than 100 charectars")
    private String username;

    private String password;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
