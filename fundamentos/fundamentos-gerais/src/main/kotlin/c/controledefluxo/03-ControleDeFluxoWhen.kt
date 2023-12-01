package c.controledefluxo

//Continuar do 37 a partir de 5 minutos
fun main(){
    println ("Segue a implementação de bonus para tipo desconhecido ${bonusWhen("asdfasdf")}")
    println ("Segue a implementação de bonus para tipo Gerente ${bonusWhen("Gerente")}")
    println ("Segue a implementação de bonus para tipo Coordenador ${bonusWhen("Coordenador")}")
    println ("Segue a implementação de bonus para tipo Engenheiro de Software ${bonusWhen("Engenheiro de Software")}")
    println ("Segue a implementação de bonus para tipo Estagiario ${bonusWhen("Estagiario")}")

    println ("Segue a implementação de bonus menos verboso para tipo desconhecido ${bonusWhenMenosVerboso("asdfasdf")}")
    println ("Segue a implementação de bonus menos verboso para tipo Gerente ${bonusWhenMenosVerboso("Gerente")}")
    println ("Segue a implementação de bonus menos verboso para tipo Coordenador ${bonusWhenMenosVerboso("Coordenador")}")
    println ("Segue a implementação de bonus menos verboso para tipo Engenheiro de Software ${bonusWhenMenosVerboso("Engenheiro de Software")}")
    println ("Segue a implementação de bonus menos verboso para tipo Estagiario ${bonusWhenMenosVerboso("Estagiario")}")
}

fun bonusWhen(cargo:String):Float{
    var bonus = 0f
    when (cargo){
        "Gerente" -> bonus = 2000f
        "Coordenador" -> bonus = 1500f
        "Engenheiro de Software" -> bonus = 1000f
        "Estagiario" -> bonus = 500f
    }
    return bonus
}

fun bonusWhenMenosVerboso(cargo:String):Float{
    return when (cargo){
        "Gerente" -> 2000f
        "Coordenador" -> 1500f
        "Engenheiro de Software" -> 1000f
        "Estagiario" -> 500f
        else -> 0f
    }
}