package br.com.roberto.microservicealunos.controller

import br.com.roberto.microservicealunos.entities.Aluno
import br.com.roberto.microservicealunos.service.AlunoService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/v1")
class AlunoController(val alunoService: AlunoService) {

    @GetMapping("/alunos")
    fun getAll(): List<Aluno> = alunoService.getAll()
    @GetMapping("/aluno/{id}")
    //@ApiOperation(value = "Get Product by Id", response = Product::class)
    fun getById(@PathVariable(value = "id") id: Long): Aluno = alunoService.getById(id)

    @PutMapping("/aluno")
    fun update(@RequestBody aluno: Aluno) = alunoService.update(aluno)

    @PostMapping("/aluno")
    fun create(@RequestBody aluno: Aluno) = alunoService.create(aluno)

    @DeleteMapping("/aluno/{id}")
    fun delete(@PathVariable(value = "id") id: Long) = alunoService.delete(id)

}