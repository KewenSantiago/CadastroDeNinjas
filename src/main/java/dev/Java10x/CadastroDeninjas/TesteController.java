package dev.Java10x.CadastroDeninjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteController {

    @GetMapping("/ping")
    public String ping() {
        return "Servidor está online e mapeando rotas com sucesso!";
    }
}