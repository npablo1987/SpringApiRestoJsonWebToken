package com.ejercicio.pvilches.app.pvilchesjwt.services;

import com.ejercicio.pvilches.app.pvilchesjwt.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;
}
