package com.ejercicio.pvilches.app.pvilchesjwt.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import lombok.Data;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;


import java.util.*;
import java.util.jar.JarException;

public class TokenUtils {

    private final static String ACCESS_TOKEN_SECRET = "2kjfd09s8fu3kjnr78sdyc325znfd5423154353fredf";
    private final static Long ACCESS_TOKEN_VALIDATY_SECOND = 2_592_000L;


    public static String createToken (String nombre, String email){
        long expirationtime =  ACCESS_TOKEN_VALIDATY_SECOND * 1000;
        Date expirationDate = new Date(System.currentTimeMillis()+ expirationtime);

        Map<String, Object> extra = new HashMap<>();
        extra.put("nombre", nombre);

        return Jwts.builder()
                .setSubject(email)
                .setExpiration(expirationDate)
                .addClaims(extra)
                .signWith(Keys.hmacShaKeyFor(ACCESS_TOKEN_SECRET.getBytes()))
                .compact();
    }


    public static UsernamePasswordAuthenticationToken getAuthentication(String token) {
        try {
        Claims claims = Jwts.parserBuilder()
                .setSigningKey(ACCESS_TOKEN_SECRET.getBytes())
                .build()
                .parseClaimsJws(token)
                .getBody();

        String email = claims.getSubject();

        return new UsernamePasswordAuthenticationToken(email, null, Collections.emptyList());

        } catch (JwtException e ){
            System.out.println("error" +e);
            return null;
        }
    }



}
