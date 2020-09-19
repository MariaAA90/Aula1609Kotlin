package Aula1609Kotlin.exercicio4

fun main() {
    val sapato1 = Sapato("Nike", "Air")
    val sapato2 = Sapato("Olympikus", "XXXXX")

    val guardaVolumes = GuardaVolumes()

    val codigo = guardaVolumes.guardarPecas(listOf(sapato1, sapato2))

    println("Peças guardadas com código $codigo")

    guardaVolumes.mostrarPecas()
    guardaVolumes.mostrarPecas(codigo)
    guardaVolumes.devolverPecas(codigo)
}