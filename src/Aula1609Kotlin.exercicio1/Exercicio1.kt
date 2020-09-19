package exercicio1

fun main() {
    val numerosLoteria = mapOf(0 to "Ovos", 1 to "Água", 2 to "Escopeta", 3 to "Cavalo", 4 to "Dentista")
    val apelido = mapOf(
        "João" to listOf("Juan", "Fissura", "Maromba"),
        "Miguel" to listOf("Night Watch", "Bruce Wayne", "Tampinha"),
        "Maria" to listOf("Wonder Woman", "Mary", "Marilene"),
        "Lucas" to listOf("Lukinha", "Jorge", "George")
    )

    numerosLoteria.forEach {
        println("${it.key} -> ${it.value}")
    }
    apelido.forEach {
        print("${it.key} -> ")
        it.value.forEachIndexed { index, s ->
            when (index) {
                it.value.size - 1 -> print(s)
                else -> print("$s, ")
            }
        }
        println()
    }
}
