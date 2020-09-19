package Aula1609Kotlin.exercicio4

class Sapato(override val marca: String, override val modelo: String) : Peca(marca, modelo) {
    override fun retirada() {
        println("Retirando sapato $this")
    }

    override fun toString(): String {
        return "$marca $modelo"
    }
}