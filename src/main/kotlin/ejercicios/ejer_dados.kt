package ejercicios

import kotlin.random.Random
var lista: MutableList<Jugador> = mutableListOf()
fun main() {
    var d1 = Dado()
    var d2 = Dado(1,3)
    var d3 = Dado(4,6)


    for (i in 1..10) {
    var jug= Jugador("Jugador $i",d1,d2,d3)

    lista.add(jug)
    }

    lista.sortByDescending { it.total }
    println(mostrarResultado())
}

fun mostrarResultado(): String {
    var cad=""
    lista.sortByDescending { it.total }
    for (jug in lista){
       cad+=("${jug.name} ha sacado ${jug.total} puntos \n")
    }
    return cad
}


class Dado (var min: Int= 1,var max: Int= 6){

    fun tiradaUnica(): Int{
        var r = Random.nextInt(min,max)
        return r
    }
}
class Jugador(var name: String,var d1: Dado,var d2: Dado,var d3: Dado) {

    var total=resultado()

    fun resultado(): Int{
        var total=0
        for (i in 1..10) {
            total+=d1.tiradaUnica()+d2.tiradaUnica()+d3.tiradaUnica()
        }
        return total
    }
}