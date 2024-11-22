package com.t2.request;

import jakarta.validation.constraints.NotBlank;

public class LoginRequest {
    @NotBlank(message = "cannot be blank")
    private String email;
    @NotBlank(message = "cannot be blank")
    private String password;

    public LoginRequest() {
    }

    public LoginRequest(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
