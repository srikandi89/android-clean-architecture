package com.trackdesk.domain.entities;

public class LoginResponseEntity {
    private int statusCode;

    public LoginResponseEntity() {}

    public LoginResponseEntity(int statusCode) {
        this.statusCode = statusCode;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }
}
