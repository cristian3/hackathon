package com.hack.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hack.app.domain.Oferta;

public interface OfertasRepository extends JpaRepository<Oferta, Long> {

}
