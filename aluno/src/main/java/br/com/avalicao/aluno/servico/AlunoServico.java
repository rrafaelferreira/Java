package br.com.avalicao.aluno.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.avalicao.aluno.modelo.AlunoModelo;
import br.com.avalicao.aluno.repositorio.AlunoRepositorio;

@Service
public class AlunoServico {
    @Autowired
    private AlunoRepositorio pr;

    //Metodo para listar os alunos 

    public Iterable<AlunoModelo> listar(){
        return pr.findAll();
    }
}