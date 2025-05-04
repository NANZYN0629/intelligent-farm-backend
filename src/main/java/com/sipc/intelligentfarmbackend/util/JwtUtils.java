package com.sipc.intelligentfarmbackend.util;

import io.jsonwebtoken.*;
import io.jsonwebtoken.security.Keys;
import io.jsonwebtoken.security.SecurityException;
import javax.crypto.SecretKey;
import java.util.Date;
import java.util.Map;

public class JwtUtils {

    // 安全密钥生成方式（推荐）
    private static final SecretKey SECRET_KEY = Keys.secretKeyFor(SignatureAlgorithm.HS256);

    // 或使用自定义密钥（需确保是32字节以上）
    // private static final String CUSTOM_KEY_STR = "aXRjYXN0aXRjYXN0aXRjYXN0aXRjYXN0";
    // private static final SecretKey SECRET_KEY = Keys.hmacShaKeyFor(CUSTOM_KEY_STR.getBytes());

    // 生成JWT（有效期12小时）
    public static String genJwt(Map<String, Object> claims) {
        return Jwts.builder()
                .claims(claims)
                .signWith(SECRET_KEY)
                .compact();
    }

    // 解析JWT
    public static Claims parseJwt(String jwt) {
        try {
            return Jwts.parser()
                    .verifyWith(SECRET_KEY)
                    .build()
                    .parseSignedClaims(jwt)
                    .getPayload();
        } catch (ExpiredJwtException e) {
            throw new RuntimeException("JWT已经过期");
        } catch (SecurityException | MalformedJwtException e) {
            throw new RuntimeException("无效的JWT签名");
        } catch (Exception e) {
            throw new RuntimeException("JWT解析失败");
        }
    }
}