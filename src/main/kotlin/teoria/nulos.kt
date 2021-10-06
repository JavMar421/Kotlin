package teoria
fun main() {

    // Kotlin exige el operador ? para que una variable pueda tomar el valor null
    val variableNullable : Int? = null
    // variableNullable.toLong() // No compila ya que toLong requiere que variable3 sea no null.
    avoidNullExceptionIfNumeroIsNull(variableNullable)
    forceNullExceptionIfNumeroIsNull(variableNullable)
    avoidNullWithLet(variableNullable)
    // variableNoNullable es de tipo Int
    val variableNoNullable = getInt(variableNullable)
    val variable = variableNoNullable?: 1

}

fun getInt(numero : Int?) : Int{
    // Si numero es null, entonces devuelve 0. En caso contrario devuelve el valor de numero.
    return numero?: 0
}

fun avoidNullExceptionIfNumeroIsNull(numero : Int?){
    println("El número recibido es... ${numero?.toLong()}")
    // toLong() no se ejecuta si numero es null que
}

fun forceNullExceptionIfNumeroIsNull(numero : Int?){
    try {
        print("El número recibido es... ${numero!!.toLong()}")
    } catch (exception : NullPointerException) {
        println("Excepción capturada")
    }
}

fun avoidNullWithLet(numero: Int?){
    numero?.let {
        println("El número recibido es... $it")
    }
}