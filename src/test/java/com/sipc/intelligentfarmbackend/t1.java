package com.sipc.intelligentfarmbackend;

import com.sipc.intelligentfarmbackend.util.JwtUtils;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class t1 {

    @Test
    public void testGenJwt() {
        Map<String, Object> claims = new HashMap<>();
        claims.put("id", 10);
        claims.put("username", "itheima");

        String jwt = JwtUtils.genJwt(claims);
        System.out.println("生成的JWT: " + jwt);

        Claims parsed = JwtUtils.parseJwt(jwt);
        System.out.println("解析结果: " + parsed);
    }



//    @Test
//    public void testParseJwt() {
//        Claims claims = Jwts.parser().setSigningKey("aXRjYXN0")
//                .parseClaimsJws("eyJhbGciOiJIUzI1NiJ9.eyJpZCI6MTAsInVzZXJuYW1lIjoiaXRoZWltYSIsImV4cCI6MTcwMTkwOTAxNX0.N-MD6DmoeIIY5lB5z73UFLN9u7veppx1K5_N_jS9Yko")
//                .getBody();
//        System.out.println(claims);
//    }
}
