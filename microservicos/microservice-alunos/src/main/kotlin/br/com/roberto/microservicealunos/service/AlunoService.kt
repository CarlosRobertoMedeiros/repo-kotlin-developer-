package br.com.roberto.microservicealunos.service

import br.com.roberto.microservicealunos.entities.Aluno
import org.springframework.stereotype.Service

@Service
interface AlunoService {
    fun getAll(): List<Aluno>
    fun getById(id: Long): Aluno
    fun create(aluno: Aluno): Aluno
    fun update(aluno: Aluno): String
    fun delete(id: Long): String
}