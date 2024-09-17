package br.com.avalicao.aluno.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.avalicao.aluno.modelo.AlunoModelo;
import br.com.avalicao.aluno.servico.AlunoServico;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class AlunoControle {
    @Autowired
    private AlunoServico ps;

    @PostMapping("/cadastrar")
    public ResponseEntity<?>cadastrar(@RequestBody AlunoModelo pm){
        return ps.cadastrar(pm);
    }
    


    @GetMapping("/listar")
    public Iterable< AlunoModelo> listar(){
        return ps.listar();
    }
    

    
    @GetMapping("")
    public String rota(){
        return "api de alunos!";
    }
}
