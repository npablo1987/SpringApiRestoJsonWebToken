package com.ejercicio.pvilches.app.pvilchesjwt.services;

import com.ejercicio.pvilches.app.pvilchesjwt.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public class UserDaeilServiceImpl implements UserDetailsService {

    @Autowired
    private UsuarioRepository usuarioRepository;




}
