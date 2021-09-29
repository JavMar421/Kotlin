package ejercicios

fun main(args: Array<String>) {
    println("Empezamos!")
    funWithoutParams()
    funWithOneParam(5)
    val myVariableInMain = 10 // myVariableInMain nace
    funWithOneParam(myVariableInMain) // myVariableInMain puede usarse
    funWithMultipleParams(15, "quince")
    println(funReturningString(1))
}

fun funWithoutParams(){
    println("=== Soy la función funWithoutParams ===")
}

fun funWithOneParam(number : Int){ // Se crea una varialbe llamada number cuyo valor será el valor que hayamos mandado (5 y 10)
    println("=== Soy la función funWithOneParam ===")
    println("He recibido el número recibido $number")
}

fun funWithMultipleParams(number : Int, text : String){ // Se crea una varialbe llamada number cuyo valor será el valor que hayamos mandado (5 y 10)
    println("=== Soy la función funWithMultipleParams ===")
    println("He recibido el número recibido $number y el texto $text")
}

fun funReturningString(param1 : Long): String{ // Se crea una varialbe llamada number cuyo valor será el valor que hayamos mandado (5 y 10)
    return "Esta función devuelve este texto y un $param1"
}