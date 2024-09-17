package br.com.avalicao.aluno.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.avalicao.aluno.modelo.AlunoModelo;
import br.com.avalicao.aluno.servico.AlunoServico;


@RestController
public class AlunoControle {
    @Autowired
    private AlunoServico ps;

    @GetMapping("/listar")
    public Iterable< AlunoModelo> listar(){
        return ps.listar();
    }
    

    
    @GetMapping("")
    public String rota(){
        return "api de alunos!";
    }
}
