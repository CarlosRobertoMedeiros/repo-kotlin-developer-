package br.com.roberto.microservicealunos.entities

import jakarta.persistence.*

@Entity
@Table(name = "Tbl_Alunos")
data class Aluno (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,
    val nome: String="default"
){

}