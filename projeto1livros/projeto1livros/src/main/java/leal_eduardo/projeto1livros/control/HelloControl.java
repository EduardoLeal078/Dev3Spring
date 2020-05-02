package leal_eduardo.projeto1livros.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControl {
    @GetMapping("/")
    public String index(){
        return "Bem Vindo! :)";
    }

}
