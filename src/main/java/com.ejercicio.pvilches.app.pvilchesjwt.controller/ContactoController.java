package com.ejercicio.pvilches.app.pvilchesjwt.controller;


import com.ejercicio.pvilches.app.pvilchesjwt.model.Contacto;
import com.ejercicio.pvilches.app.pvilchesjwt.repository.ContactoRepository;
import com.ejercicio.pvilches.app.pvilchesjwt.services.ContactoService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/apicontactos")
@AllArgsConstructor
public class ContactoController {

    @Autowired
    ContactoService contactoService;

    @GetMapping("/ver")
    public List<Contacto> listContacto() {
        return contactoService.obtejerContactos();
    }

}
