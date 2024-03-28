package f.orientacaoabjetos.classe.`09-heranca`

class ContaPoupanca(numeroConta: String, saldo: Double, val taxaJuros: Double) : Conta(numeroConta, saldo) {
    override fun depositar(valor: Double) {
        super.depositar(valor)
        aplicarJuros()
    }

    private fun aplicarJuros() {
        saldo *= (1 + taxaJuros)
        println("Juros aplicados. Novo saldo: $saldo")
    }
}