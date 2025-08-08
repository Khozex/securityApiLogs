package com.example.securityApiExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class SecurityApiController {

    @Autowired
    private SecurityApiService service;

    @PostMapping("/optin")
    public void handleOptIn(@RequestBody OptInCodeRequest request) {
        //Utilizando o log default do Spring Boot para logar a requisição : Sem a proteção de dados pessoais fornecida pelo Logback
        System.out.println("Received opt-in request: " + request);
        service.processOptIn(request);
    }
}
