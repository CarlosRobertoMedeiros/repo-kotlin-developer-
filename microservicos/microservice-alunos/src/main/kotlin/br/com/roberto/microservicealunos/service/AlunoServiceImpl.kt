package br.com.roberto.microservicealunos.service

import br.com.roberto.microservicealunos.entities.Aluno
import br.com.roberto.microservicealunos.repository.AlunoRepository
import org.springframework.stereotype.Service

@Service
class AlunoServiceImpl(val alunoRepository: AlunoRepository) : AlunoService {
    override fun getAll(): List<Aluno> = alunoRepository.findAll()

    override fun getById(id: Long): Aluno = alunoRepository.getReferenceById(id)

    override fun create(aluno: Aluno): Aluno = alunoRepository.save(aluno)

    override fun update(aluno: Aluno): String {
        if (!alunoRepository.existsById(aluno.id))
            return "Aluno não existe na base de dados"
        alunoRepository.save(aluno)
        return "Aluno id ${aluno.id} alterado com sucesso"
    }

    override fun delete(id: Long): String {
        if (!alunoRepository.existsById(id))
            return "Aluno não existe na base de dados"
        alunoRepository.deleteById(id)
        return "Aluno removido com sucesso!"
    }
}