package com.ejercicio.pvilches.app.pvilchesjwt.repository;

import com.ejercicio.pvilches.app.pvilchesjwt.model.Usuario;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {

    Optional<Usuario> findOneByEmail(String email);

}
