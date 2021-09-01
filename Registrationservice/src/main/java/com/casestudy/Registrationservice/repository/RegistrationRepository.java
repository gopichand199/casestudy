package com.casestudy.Registrationservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.casestudy.Registrationservice.models.Registration;

public interface RegistrationRepository extends MongoRepository<Registration, String> {

}
