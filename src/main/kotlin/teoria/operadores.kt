fun main() {
    var num = 10
    var num2 = 2

    // boolean si es igual
    println(num==num2)

    // boolean si esta en el campo n..n
    println(num in 0..10)

    // boolean si es tipo de var n
    println(num is Int)

    // si ambas condiciones se cumplen
    println(num is Int && num in 0..5)

    // si una se cumple
    println(num is Int || num in 0..5)

    //Operaciones
    println("Operaciones Suma: + Resta: - Multiplicación: * División: / Resto: %")


}