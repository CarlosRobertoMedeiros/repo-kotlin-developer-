package f.orientacaoabjetos.classe.`06-data_class`

class Forma(val a:Int, val b:Int) {
    override fun equals(other: Any?): Boolean {
        return if (other is Forma) (other.a == this.a && other.b == this.b)
        else false
    }

    override fun toString(): String {
        return "Forma(a=$a, b=$b)"
    }

    override fun hashCode(): Int {
        var result = a
        result = 31 * result + b
        return result
    }

}
//Exige o val ou var
//O dataClass já implementa toString(), Equals e HashCode
//Sem precisar implementar essas variações
// O DataClass já trata o equals com valores dos atributos
data class FormaData(val a:Int, val b:Int)

fun main(){
    println("---------Utilizando Class--------------")
    val f1 = Forma(10,8)
    val f2 = Forma(10,8)
    println(f1.equals(f2))
    println(f1.toString())
    println(f1.hashCode())
    println("---------------")
    println(f2.toString())
    println(f2.hashCode())
    println("---------Utilizando Data Class--------------")
    val f3 = FormaData(10,8)
    val f4 = FormaData(10,8)
    println(f3.equals(f4))
    println(f3.toString())
    println(f3.hashCode())
    println("---------------")
    println(f4.toString())
    println(f4.hashCode())
}