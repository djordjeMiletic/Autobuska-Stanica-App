package com.ftninfowrmatika.jwd48.testback.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ftninfowrmatika.jwd48.testback.model.Prevoznik;

@Repository
public interface PrevoznikRepository extends JpaRepository<Prevoznik, Long> {
	
	Prevoznik findOneById(Long id);

}
