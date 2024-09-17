package br.com.avalicao.aluno.controle;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;;

@RestController
public class AlunoControle {
    
    @GetMapping("")
    public String rota(){
        return "api de alunos!";
    }
}
