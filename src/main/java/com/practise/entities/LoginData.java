package com.practise.entities;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class LoginData {



    @NotBlank(message = "User Name can not be empty !!")
    @Size(min = 3, max = 12, message = " User name must be between 3 - 12 characters !! ")
    private String userName;

    @NotBlank(message="use only valid email !!")
    @Pattern(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$",message = "Invalid Email !!")
    private String email;


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName=userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email=email;
    }



    @Override
    public String toString() {
        return "LoginData{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\''

                ;
    }
}
