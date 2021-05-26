package com.ftninfowrmatika.jwd48.testback.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ftninfowrmatika.jwd48.testback.model.Rezervacija;
import com.ftninfowrmatika.jwd48.testback.repository.RezervacijaRepository;
import com.ftninfowrmatika.jwd48.testback.service.RezervacijaService;

@Service
public class JpaRezervacijaService implements RezervacijaService {

	@Autowired
	private RezervacijaRepository rezervacijaRepository;
	
	@Override
	public Rezervacija save(Rezervacija rezervacija) {
		return rezervacijaRepository.save(rezervacija);
	}

}
