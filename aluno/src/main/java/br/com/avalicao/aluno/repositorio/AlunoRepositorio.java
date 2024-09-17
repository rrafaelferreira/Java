package br.com.avalicao.aluno.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.avalicao.aluno.modelo.AlunoModelo;

@Repository
public interface AlunoRepositorio extends CrudRepository<AlunoModelo, Long> {

    
}
