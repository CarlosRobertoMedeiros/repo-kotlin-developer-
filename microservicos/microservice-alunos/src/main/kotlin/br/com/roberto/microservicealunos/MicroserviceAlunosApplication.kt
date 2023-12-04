package br.com.roberto.microservicealunos

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MicroserviceAlunosApplication

fun main(args: Array<String>) {
	runApplication<MicroserviceAlunosApplication>(*args)
}
