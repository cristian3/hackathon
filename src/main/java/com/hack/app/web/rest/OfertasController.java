package com.hack.app.web.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hack.app.domain.Oferta;
import com.hack.app.service.OfertaService;

@RestController
@RequestMapping("/ofertas")
public class OfertasController {
	
	@Autowired
	private OfertaService ofertasService;
	public OfertasController(OfertaService service){
		this.ofertasService=service;
	}
	@GetMapping(value="/all")
	public ResponseEntity<List<Oferta>> getOfertas(){
		return new ResponseEntity<List<Oferta>>(this.ofertasService.getOfertasById(),HttpStatus.OK);
	}
}
