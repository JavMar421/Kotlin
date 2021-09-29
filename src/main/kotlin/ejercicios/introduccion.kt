package ejemplos
fun main(){


    // PROPIEDADES DE LAS VARIABLES I

    // Cambio de valor de una variable
    var variable = 1
    println("Variable tomará el valor $variable")

    variable = 2 // Fijáte que ya no ponemos el "var" ya que la variable ya existe.
    println("Variable tomará el valor $variable")

    // Aplicando operaciones básicas.
    variable = 3 + 2 // variable tomará el valor 5
    println("Variable tomará el valor $variable")
    variable = variable + 10 // variable tomará el valor 15
    println("Variable tomará el valor $variable")
    variable += 10 // equivalente al punto anterior pero más bonito. Vaariable tomará el valor 25
    println("Variable tomará el valor $variable")
    variable = 6 - 1 // variable tomará el valor 5
    println("Variable tomará el valor $variable")


    // PROPIEDADES DE LAS VARIABLES II

    // Creando variables de tipo Texto
    val varString = "Esto es un String / cadena de texto"

    // Creando variables de tipo número entero
    val varInt = 1 // Representado por 32 bits.
    val varLong = 1L // Representado por 64 bits.

    // Creando variables de tipo número decimal
    val varFloat = 1.0F // Representado por 32 bits.
    val varDouble = 1.0 // Representado por 64 bits.

    // Alternativa forzando el Tipo
    val varStringForzado : String = "Esto es un String / cadena de texto"

    // Variables de tipo número entero
    val varIntForzado : Int = 1 // Representado por 32 bits.
    val varLongForzado : Long = 1 // Representado por 64 bits.

    // Variables de tipo número decimal
    val varFloatForzado : Float = 1.0F // Representado por 32 bits.
    val varDoubleForzado : Double = 1.0 // Representado por 64 bits.

    // Otros tipos
    val varShortForzado : Short = 1 // Representado por 16 bits.

    // A las variables de un tipo se le deben asignar valores de ese tipo.
    var variable1 = 1
    var variable2 : Long = 10

    variable1 = 2 // Como variable1 es "var", esto funciona.
    // variable2 = variable1 // Cómo variable2 es de tipo Long, asignarle una variable una varialbe de tipo Int
    // no funcionará.

    print("La variable 1 ")
    if (variable1 is Int) println("es un Int") else println("no es un Int")


    variable2 = variable1.toLong() // Cómo a variable1 le aplicamos el "toLong()" entonces si funciona, ya que
    // le estamos cambiando el tipo

    // PROPIEDADES DE LAS VARIABLES III

    // val variable3 : Int = null // No compila
    val variable3 : Int? = null

    println("La variable3 tiene el valor $variable3")

    // Print y Println
    print("Probando print(): La variable1 tiene el valor entero de ")
    print(variable1)

    // Escribe una línea vacía
    println()

    println("Probando println(): La variable1 tiene el valor entero de ")
    println(variable1)

    println("La variable1 tiene el valor entero de $variable1")

    println("La variable1 tiene el valor en Float de ${variable1.toFloat()}")

}