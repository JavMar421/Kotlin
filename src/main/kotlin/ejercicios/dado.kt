package ejercicios
import kotlin.random.Random
class Dado2 {

    var min = 1
    var max = 6
    var tiempo = 0
    var kills = 0
    var deaths = 0

    fun caras(min: Int,max: Int){
        this.min=min
        this.max=max
    }

    fun tiradaUnica(): Int{
        var r = Random.nextInt(min,max)
        return r
    }
    fun tiradaMultiple(): Int{
        var r = Random.nextInt(min,max)
        var r2 = Random.nextInt(min,max)
        if (r==r2) return r*r2
        else  return r+r2
    }
}