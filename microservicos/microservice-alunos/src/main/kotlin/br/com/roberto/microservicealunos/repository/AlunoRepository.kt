package br.com.roberto.microservicealunos.repository

import br.com.roberto.microservicealunos.entities.Aluno
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.stereotype.Repository

@Repository
@EnableJpaRepositories
interface AlunoRepository : JpaRepository<Aluno, Long> {

}