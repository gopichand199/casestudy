package com.casestudy.Registrationservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.casestudy.Registrationservice.models.Registration;
import com.casestudy.Registrationservice.repository.RegistrationRepository;

@Service
public class RegistrationServiceImpl{

	@Autowired
	private RegistrationRepository registrationRepository;

	public List<Registration> getAllRegistrations() {
		return registrationRepository.findAll();
	}

	public void add(Registration registration) {
		this.registrationRepository.save(registration);
	}

}
