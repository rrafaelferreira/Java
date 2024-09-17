package br.com.avalicao.aluno.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.avalicao.aluno.modelo.AlunoModelo;
import br.com.avalicao.aluno.modelo.RespostaModelo;
import br.com.avalicao.aluno.repositorio.AlunoRepositorio;

@Service
public class AlunoServico {
    @Autowired
    private AlunoRepositorio pr;

    @Autowired
    private RespostaModelo rm;

    //Metodo para listar os alunos 

    public Iterable<AlunoModelo> listar(){
        return pr.findAll();
    }

    // Metodo para cadastra os alunos

    public ResponseEntity<?> cadastrar(AlunoModelo pm){
        if(pm.getName().equals("")){
            rm.setMensagem("O nome do aluno é obrigatorio");
            return new ResponseEntity<RespostaModelo>(rm,HttpStatus.BAD_REQUEST);
        }else if(pm.getEmail().equals("")){
            rm.setMensagem("A nome da marca é obrigatorio");
            return new ResponseEntity<RespostaModelo>(rm, HttpStatus.BAD_REQUEST);

        }else{
            return new ResponseEntity<AlunoModelo>(pr.save(pm),HttpStatus.CREATED);
        }
    }
}