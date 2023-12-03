package d.excecoesnullsafety

import java.lang.ArithmeticException

fun main(){

    try {
        val s: String? = null
        println(s!!.length) //Assumindo o nullPointer
        val a = 10 /0
    } catch (e:NullPointerException){
        println("Variável Nula")
    }catch (e: ArithmeticException){
        println("Impossível Dividir por Zero")
    }
}