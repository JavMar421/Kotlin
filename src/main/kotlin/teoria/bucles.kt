fun main() {
    var numero = 0
    //if
    println("If:")
    if (numero == 0) println("$numero es igual a 0 ")
    else println("$numero es diferente a 0 ")

    if (numero in 0..9) println("$numero es un numero comprendido entre 0 y 9")
    else println("$numero es mayor que 9")

    //when
    println("When:")
    when (numero) {
        0 -> println("$numero es igual a 0 ")
        in 1..99 -> println("$numero es un número comprendido entre 0 y 99")
        100,101 -> println("$numero es 100 o 101")
        else -> println("$numero es menor de 0 y mayor de 101")
    }
    //repeat
    println("Repeat:")
    repeat(10){
        println("Estoy repitiendo esto por $it vez de un total de 10")
    }
    //for do while
    while (numero == 2){ print("es 2")
    }
    do { println("\n haciendo cosa mientras...")
    } while (numero == 2)

    for (i in 1..10){ println("for $i")
    }

}