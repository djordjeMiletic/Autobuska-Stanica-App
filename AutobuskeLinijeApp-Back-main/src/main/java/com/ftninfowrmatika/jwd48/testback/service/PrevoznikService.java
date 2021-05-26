package com.ftninfowrmatika.jwd48.testback.service;

import java.util.List;

import com.ftninfowrmatika.jwd48.testback.model.Prevoznik;

public interface PrevoznikService {

	List<Prevoznik> findAll();
	
	Prevoznik findOneById(Long id);
	
	Prevoznik save(Prevoznik prevoznik);
}
