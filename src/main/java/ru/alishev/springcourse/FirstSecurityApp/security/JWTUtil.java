package ru.alishev.springcourse.FirstSecurityApp.security;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.validation.Valid;
import java.time.ZonedDateTime;
import java.util.Date;

@Component
public class JWTUtil {
    @Value("${jwt_secret}")
    private String secret;

    public String generateToken(String username){
        Date date = Date.from(ZonedDateTime.now().plusMinutes(60).toInstant());

        return JWT.create().withSubject("UserDetails")
                .withClaim("username",username)
                .withIssuedAt(new Date())
                .withIssuer("alishev")
                .withExpiresAt(date)
                .sign(Algorithm.HMAC256("asdasdasd"));
    }
}
