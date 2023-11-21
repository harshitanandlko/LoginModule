package com.cblLoginModule.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Applicant {

    @Id
    private String username;
    private String password;

    public Applicant() {
        // Default constructor
    }

    public Applicant(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        // Add validation logic if needed
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        // Add validation logic if needed
        this.password = password;
    }

    // getters and setters
}
