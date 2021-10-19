package ejercicios

fun main(args: Array<String>) {
    val lista = listOf("Hola,", 2, 3, "¿", 0.1, "Qué", 1, "tal", 0.9, "?")
    var cad = ""
    var dob = 0.0
    lista.forEach {
        when (it) {
            is String -> cad += it
            is Double -> dob += it
            is Int -> dob += it
        }
    }
    println("Contenido: $cad")
    println("Suma: $dob")

}
