package com.ejercicio.pvilches.app.pvilchesjwt.security;

import lombok.Data;

@Data
public class AuthCredentials {
    private String email;
    private String password;
}
