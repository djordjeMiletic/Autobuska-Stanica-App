package com.ftninfowrmatika.jwd48.testback.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.ftninfowrmatika.jwd48.testback.model.Rezervacija;

@Component
public interface RezervacijaRepository extends JpaRepository<Rezervacija, Long> {

}
