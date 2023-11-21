package com.cblLoginModule.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cblLoginModule.entities.Applicant;
import com.cblLoginModule.repository.ApplicantRepository;

@Service
public class AuthenticationService {

    @Autowired
    private ApplicantRepository applicantRepository;

    public String authenticate(String username, String password) {
        Applicant applicant = applicantRepository.findById(username).orElse(null);

        if (applicant != null && applicant.getPassword().equals(password)) {
            return "success";
        } else {
            return "error";
        }
    }

    public boolean userExists(String username) {
        return applicantRepository.existsById(username);
    }

    public void registerUser(String username, String password) {
        // Check if the username already exists
        if (userExists(username)) {
            throw new RuntimeException("Username already exists");
        }

        // Create a new applicant
        Applicant newApplicant = new Applicant();
        newApplicant.setUsername(username);
        newApplicant.setPassword(password);

        // Save the new applicant to the database
        applicantRepository.save(newApplicant);
    }

}
