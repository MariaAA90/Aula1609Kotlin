package exercicio2

fun main(){
    var lista = mutableListOf<Int>()
    lista.add(1)
    lista.add(5)
    lista.add(5)
    lista.add(6)
    lista.add(7)
    lista.add(8)
    lista.add(8)
    lista.add(8)
    println("Elementos da lista:")
    lista.forEach {
        println(it)
    }

    var conjunto = mutableSetOf<Int>()
    conjunto.add(1)
    conjunto.add(5)
    conjunto.add(5)
    conjunto.add(6)
    conjunto.add(7)
    conjunto.add(8)
    conjunto.add(8)
    conjunto.add(8)
    println("Elementos do conjunto:")
    conjunto.forEach {
        println(it)
    }
}