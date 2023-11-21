package com.cblLoginModule.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cblLoginModule.entities.Applicant;

public interface ApplicantRepository extends JpaRepository<Applicant, String>  {

}
