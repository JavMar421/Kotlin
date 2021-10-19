package ejercicios


fun main() {
    val letras= mutableListOf<Char>()
    var intentos=0
    println("Jugador 1 inserte la palabra a adivinar")
    val palabra= readLine()?.toUpperCase()

    repeat(13){
        println("--------")
    }
    println("Jugador 2 es su turno")
    do{
        println("Elije una letra")
        val letra=readCharFromKeyboard().toUpperCase()
        if(letras.contains(letra)){
            println("Ya has elegido esta letra")
        }else{
            intentos++
            letras.add(letra)
        }
        val incognita= palabra?.let { getincognita(it,letras) }
        println(incognita)
    }while(incognita?.contains("_") == true)
    println("Has acertado la palabra $palabra en $intentos intentos!")
}

fun getincognita(palabra: String, letras: List<Char>) : String {
    var incognita = ""
    palabra.toUpperCase().toCharArray().forEach { char ->
        if (letras.contains(char)){
            incognita += char
        } else {
            incognita += "_"
        }
    }
    return incognita
}

fun readCharFromKeyboard(): Char {
    var result: Char?
    do {
        val selectedOption = readLine()
        result = if (selectedOption?.length == 1) selectedOption[0] else null
    } while (result == null)
    return result
}

