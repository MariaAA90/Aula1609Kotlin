package Aula1609Kotlin.exercicio4

abstract class Peca(open val marca: String, open val modelo: String) {
    abstract fun retirada()
}