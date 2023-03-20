package dio.web.api.controller;

import dio.web.api.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @Autowired
    private UsuarioRepository repository;
    @GetMapping
    public String welcome(){
        return "Welcome to My Spring Boot Web Api";
    }
}
