package com.ejercicio.pvilches.app.pvilchesjwt.services;

import com.ejercicio.pvilches.app.pvilchesjwt.model.Contacto;
import com.ejercicio.pvilches.app.pvilchesjwt.repository.ContactoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactoService {

    @Autowired
    ContactoRepository contactoRepository;

    public List<Contacto> obtejerContactos() {
        return (List<Contacto>) contactoRepository.findAll();
    }



}
