package leal_eduardo.projeto3animacao.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControl {
    @GetMapping("/")
    public String index(){
        return "Bem vindo!";
    }
}
