package Aula1609Kotlin.exercicio3

class Prova {
    fun somaTotal(conjuntoDeInteiros: Set<Int>) {
        var soma = 0
        conjuntoDeInteiros.forEach {
            soma += it
        }
        println("Soma total: $soma")
    }
}