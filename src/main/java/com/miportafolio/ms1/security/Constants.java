package com.miportafolio.ms1.security;

public class Constants {
    // Spring Security

    public static final String LOGIN_URL = "/login";
    public static final String REGISTRO_URL = "/usuario/registro";
    public static final String UPDATE_URL = "/usuario/actualizar";
    public static final String DETALLE_URL = "/usuario/detalle/*";
    public static final String HEADER_AUTHORIZACION_KEY = "Authorization";
    public static final String TOKEN_BEARER_PREFIX = "Bearer ";

    // JWT

    public static final String ISSUER_INFO = "https://www.autentia.com/";
    public static final String SUPER_SECRET_KEY = "m1p0rt4f0l10S3cr3t";
    public static final long TOKEN_EXPIRATION_TIME = 900000; // 15 minutos
}
