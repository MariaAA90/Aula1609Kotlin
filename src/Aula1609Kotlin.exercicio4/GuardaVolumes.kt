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
        volumes.forEach {
            println("${it.key} -> ${it.value}")
        }
    }

    fun mostrarPecas(numero: Int) {
        if (volumes[numero] != null) {
            println("Volumes com código $numero: ${volumes[numero]}")
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