package com.ejercicio.pvilches.app.pvilchesjwt.repository;

import com.ejercicio.pvilches.app.pvilchesjwt.model.Contacto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactoRepository extends CrudRepository<Contacto, Integer> {
}
