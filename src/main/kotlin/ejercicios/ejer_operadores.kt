package ejercicios

fun main() {
    /* adding()
     addingMixingTypes()
     weirdCasesAndOtherOperations()
     shortOperations()*/
    entero(-5)
}


fun adding(){

    // Las operaciones de resta sería exactamente igual (Salvo para el String)
    val sumaEnteros = 1 + 2
    println("sumeEnteros = $sumaEnteros y es de tipo ${sumaEnteros.javaClass.name}")
    val sumaLongs = 2L + 3L
    println("sumaLongs = $sumaLongs y es de tipo ${sumaLongs.javaClass.name}")
    val sumaFloats = 4F + 5F
    println("sumaFloats = $sumaFloats y es de tipo ${sumaFloats.javaClass.name}")
    val sumaDoubles = 4.5 + 5.5
    println("sumaDoubles = $sumaDoubles y es de tipo ${sumaDoubles.javaClass.name}")
    val sumaStrings = "Hola " + "Que tal"
    println("sumaStrings = $sumaStrings y es de tipo ${sumaStrings.javaClass.name}")

}


fun addingMixingTypes(){

    // Las operaciones de resta sería exactamente igual
    val suma1 = 1 + 2L
    println("suma1 = $suma1 y es de tipo ${suma1.javaClass.name}")
    val suma2 = 2L + 3
    println("suma2 = $suma2 y es de tipo ${suma2.javaClass.name}")
    val suma3 = 4 + 5F
    println("suma3 = $suma3 y es de tipo ${suma3.javaClass.name}")
    val suma4 = 4F + 5.5
    println("suma4 = $suma4 y es de tipo ${suma4.javaClass.name}")
    val suma5 = "Hola " + 1
    println("sumaStrings = $suma5 y es de tipo ${suma5.javaClass.name}")

}

fun weirdCasesAndOtherOperations() {
    // División de enteros
    val division = 5 / 2
    println("division = $division y es de tipo ${division.javaClass.name}")

    // Calcular el resto
    val resto = 5 % 2
    println("resto = $resto y es de tipo ${resto.javaClass.name}")

}

fun shortOperations() {
    var shortSuma = 1
    println("shortSuma1 vale $shortSuma")
    shortSuma++
    println("shortSuma1 vale $shortSuma")
    shortSuma += 4
    println("shortSuma1 vale $shortSuma")

    var shortResta = 1
    println("shortSuma1 vale $shortResta")
    shortResta--
    println("shortSuma1 vale $shortResta")
    shortResta -= 4
    println("shortSuma1 vale $shortResta")

    var shortMultiplication = 5
    shortMultiplication *= 2
    println("shortMultiplication vale $shortMultiplication")

    var shortDivision = 5
    shortDivision /= 2
    println("shortDivision vale $shortDivision")
}
fun entero(numero: Int){
    var num=numero
    if (num > 0) num=numero*2+3
    else if (num<0) num=numero/2-3
    else num=0
    println("Numero: $num")
}