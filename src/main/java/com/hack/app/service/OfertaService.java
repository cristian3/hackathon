package com.hack.app.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hack.app.domain.Oferta;
import com.hack.app.repository.OfertasRepository;
@Service
@Transactional
public class OfertaService {

	private OfertasRepository ofertasRepository;
	public OfertaService(OfertasRepository repository){
		this.ofertasRepository=repository;
	}
	public List<Oferta> getOfertasById(){
		return this.ofertasRepository.findAll();
	}
}
