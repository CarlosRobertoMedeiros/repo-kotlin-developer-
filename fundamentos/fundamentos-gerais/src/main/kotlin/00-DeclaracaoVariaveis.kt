/**
 Type    Bit
 Double  64
 Float   32
 Long    64
 Int     32
 Short   16
 Byte     8
 Boolean  ? 0 u 1 um bit
 String   ?
 Char     ?
 */
fun main() {
    println("Declaração de Variáveis")

    var nome: String = "Carlos Roberto"; //Declaração de Variável String
    println(nome);
    numericos()
    inicializacaoDeVariaveis();


//    println("Boolean MAX ${Boolean.MAX_VALUE} - Min ${Double.MIN_VALUE}");
//    println("String MAX ${String.MAX_VALUE} - Min ${Double.MIN_VALUE}");
    println("Char MAX ${Char.MAX_VALUE} - Min ${Char.MIN_VALUE}");
}
fun inicializacaoDeVariaveis(){
    var c: Char='A'
    var s:String = "Carlos Roberto"
    var b:Boolean = false

}
fun numericos(){
    println("Double MAX ${Double.MAX_VALUE} - Min ${Double.MIN_VALUE}");
    println("Float MAX ${Float.MAX_VALUE} - Min ${Float.MIN_VALUE}");
    println("Long MAX ${Long.MAX_VALUE} - Min ${Long.MIN_VALUE}");
    println("Int MAX ${Int.MAX_VALUE} - Min ${Int.MIN_VALUE}");
    println("Short MAX ${Short.MAX_VALUE} - Min ${Short.MIN_VALUE}");
    println("Byte MAX ${Byte.MAX_VALUE} - Min ${Byte.MIN_VALUE}");
}