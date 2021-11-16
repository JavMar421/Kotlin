package ejercicios
fun main(){

    val lista = listOf(Gato(2.0), Perro(20.0), Persona(89.0),Gato(3.0), Perro(15.0), Persona(79.0),Gato(3.0), Perro(25.0), Persona(99.0))
    // El peso medio de los gatos es:
    println("El peso medio de los gatos es ${calcularPesoMedioGatos(lista)}")
    // El peso medio de los perros es:
    println("El peso medio de los perros es ${calcularPesoMedioPerros(lista)}")
    // El peso medio de las personas es:
    println("El peso medio de las personas es ${calcularPesoMedioPersonas(lista)}")



    lista.forEach {
        // Para el gato 1, el resutlado es -0,2. Para el perro 1 - 2.0, para la persona 1 es + 4.
        println("Este animal tiene un peso de ${it.calcularDesviacionDelPesoIdeal()} sobre lo esprado")
    }

}
abstract class LisPadre(){
    abstract var peso: Double
    abstract var pesoIdeal: Double
    open fun calcularDesviacionDelPesoIdeal(): Double{
    var desviacion: Double
    desviacion= peso-pesoIdeal
        return desviacion
    }
}

// Utiliza Herencia para Calcular desviación respecto a su peso ideal.
// Peso ideal del perro = 22
// Peso ideal del gato = 2.2
// Peso ideal de la persona = 85
class Perro(override var peso: Double):LisPadre() {
    override var pesoIdeal= 22.0
}
class Gato(override var peso: Double):LisPadre() {
    override var pesoIdeal= 2.2
}
class Persona(override var peso: Double):LisPadre() {
    override var pesoIdeal= 85.0
}


fun calcularPesoMedioGatos(lista: List<LisPadre>): Double {

    var media= 0.0
    var gato= 0

    lista.forEach{
        if(it is Gato){
            media+=it.peso
            gato++
        }
    }
    media=media/gato
    return media

}

fun calcularPesoMedioPerros(lista: List<LisPadre>): Double {

    var media = 0.0
    var perro = 0

    lista.forEach {
        if (it is Perro) {
            media += it.peso
            perro++
        }
    }
    media = media / perro
    return media
}

fun calcularPesoMedioPersonas(lista: List<LisPadre>): Double {

    var media = 0.0
    var persona = 0

    lista.forEach {
        if (it is Persona) {
            media += it.peso
            persona++
        }
    }
    media = media / persona
    return media

}

