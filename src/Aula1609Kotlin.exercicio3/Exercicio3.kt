package exercicio3

fun main() {
    val p1 = setOf<Int>(10, 9, 2, 10)
    val p2 = setOf<Int>(3, 4, 1, 1)

    val prova = Prova()

    prova.somaTotal(p1)
    prova.somaTotal(p2)

    println("Elementos do conjunto p1:")
    p1.forEach {
        println(it)
    }
    println("Elementos do conjunto p2:")
    p2.forEach {
        println(it)
    }
}