fun main() {
    //variables
    var num = 1
    var texto : String = "hola"
    var verdad : Boolean = true

    //Para que sea null
    var num2 : Int? = null

    //constante
    val cons = 10
    val cons2 = "texto"

    //sin salto
    print("no salto $texto ")
    print(texto)
    //con salto
    println(" texto con salto de linea $num2")
    println(verdad)

    //conversión
    println("conversión $num a " +num.toFloat());

    println(returnString(1,"hola "))

    noparametros()
    parame(9)

}
//funcion que devuelve todo a String
fun returnString (numero : Int,cadena : String ): String{
    val cad = cadena + numero
    return "Devuelvo $cadena y $cad"
}
//sin parametros
fun noparametros(){
    println("jiji de jiji no parametro")
}
//con parametros
fun parame (numero2 : Int){

    println("con parametros: $numero2")
}


