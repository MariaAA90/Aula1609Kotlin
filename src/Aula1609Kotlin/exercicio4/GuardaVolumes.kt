package Aula1609Kotlin.exercicio4

class GuardaVolumes {
    var contador = 0
    var volumes = mutableMapOf<Int, List<Peca>>()

    fun guardarPecas(pecas: List<Peca>): Int {
        contador += 1
        volumes.put(contador, pecas)
        return contador
    }

    fun mostrarPecas() {
        volumes.forEach { chave, pecas ->
            print("$chave -> ")
            pecas.forEachIndexed { indice, peca ->
                when (indice) {
                    pecas.size - 1 -> print(peca)
                    else -> print("$peca, ")
                }
            }
            println()
        }
    }

    fun mostrarPecas(numero: Int) {
        if (volumes[numero] != null) {
            print("Volumes com código $numero: ")
            volumes[numero]!!.forEachIndexed { indice, peca ->
                when (indice) {
                    volumes[numero]!!.size - 1 -> print(peca)
                    else -> print("$peca, ")
                }
            }
            println()
        } else {
            println("Número inválido")
        }
    }

    fun devolverPecas(numero: Int) {
        if (volumes[numero] != null) {
            volumes[numero]!!.forEach {
                it.retirada()
            }
            volumes.remove(numero)
        } else {
            println("Número inválido")
        }
    }
}