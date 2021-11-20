package com.miportafolio.ms1.security;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.miportafolio.ms1.dto.ResponseDTO;
import com.miportafolio.ms1.mappers.UsuarioMapper;
import com.miportafolio.ms1.models.Usuario;
import com.miportafolio.ms1.repositories.UsuarioRepository;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

public class JWTAuthenticationFilter extends UsernamePasswordAuthenticationFilter {
    private AuthenticationManager authenticationManager;
    private UsuarioRepository usuarioRepository;
    private UsuarioMapper usuarioMapper;

    public JWTAuthenticationFilter(AuthenticationManager authenticationManager, UsuarioRepository usuarioRepository,
            UsuarioMapper usuarioMapper) {
        this.authenticationManager = authenticationManager;
        this.usuarioRepository = usuarioRepository;
        this.usuarioMapper = usuarioMapper;
    }

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
            throws AuthenticationException {
        try {
            Usuario credenciales = new ObjectMapper().readValue(request.getInputStream(), Usuario.class);

            return authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(credenciales.getCorreo(),
                    credenciales.getContrasena(), new ArrayList<>()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain,
            Authentication auth) throws IOException, ServletException {
        String token = Jwts.builder().setIssuedAt(new Date()).setIssuer(Constants.ISSUER_INFO)
                .setSubject(((User) auth.getPrincipal()).getUsername())
                .setExpiration(new Date(System.currentTimeMillis() + Constants.TOKEN_EXPIRATION_TIME))
                .signWith(SignatureAlgorithm.HS512, Constants.SUPER_SECRET_KEY).compact();
        Usuario user = usuarioRepository.findByCorreo(((User) auth.getPrincipal()).getUsername());
        user.setContrasena(null);
        ObjectMapper mapper = new ObjectMapper();
        response.getWriter()
                .write(mapper.writeValueAsString(new ResponseDTO(true, null, usuarioMapper.usuarioToUsuarioDTO(user))));
        response.setContentType("application/json");
        response.addHeader(Constants.HEADER_AUTHORIZACION_KEY, Constants.TOKEN_BEARER_PREFIX + " " + token);
    }

    @Override
    protected void unsuccessfulAuthentication(HttpServletRequest request, HttpServletResponse response,
            AuthenticationException failed) throws IOException, ServletException {
        ObjectMapper mapper = new ObjectMapper();
        response.getWriter().write(
                mapper.writeValueAsString(new ResponseDTO(false, "Correo electronico y/o contraseña incorrectos")));
        response.setContentType("application/json");
        response.setStatus(200);
    }
}