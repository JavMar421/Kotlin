package teoria

fun main() {
    println("El número seleccionado es ${leerNumero()}")
}

fun leerNumero(): Int {
    var textoLeido : String?
    do {
        println("Introduce un número")
        textoLeido = readLine()
        textoLeido?.let { texto->
            try {
                return texto.toInt()
            } catch (e : NumberFormatException) {
                println("$texto no parece ser un número")
            }
        }
    } while (true)
}