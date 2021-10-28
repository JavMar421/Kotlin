package ejercicios

import kotlin.random.Random

fun main(args: Array<String>) {
    var d1 = Dado()
    var d2 = Dado()
    var d3 = Dado()
    d2.maxmin(1,3)
    d3.maxmin(4,6)

    var total = 0
    var i = 0
    var D1 = 0
    var D2 = 0
    var D3 = 0
    var lista = mutableListOf(Jugador())

    for ( i in 1..10) {
       var ob = Jugador()


    for ( i in 1..100) {
        D1 = D1 + d1.tiradaUnica()
        D2 = D2 + d2.tiradaUnica()
        D3 = D3 + d3.tiradaUnica()
        total=D1+D2+D3
    }
        ob.cons("$i",total)
        lista.add(ob)
    }
}


class Dado {

    var min = 1
    var max = 6

    fun maxmin(min: Int,max: Int){
        this.min=min
        this.max=max
    }

    fun tiradaUnica(): Int{
        var r = Random.nextInt(min,max)
        return r
    }
}
class Jugador {

    var name = ""
    var resultado = 0
    fun cons(name: String,resultado: Int){
        this.name=name
        this.resultado=resultado
        }
    fun mostrarResutlado(): String {
        var cad= "Jugador $name ha sacado $resultado puntos"
        return cad
        }
}