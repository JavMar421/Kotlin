package ejercicios

fun main(){
    var num1 = 10
    var num2 = 5
    println(tostring(num1,num2))

}

fun tostring(pisos : Int, ventanas : Int): String {

    var cadena=""
    repeat (ventanas*3+2){
        cadena += "_"
    }
    cadena += "\n"
    repeat(pisos) {
        cadena += "|"
        repeat(ventanas) {
            cadena += "_█_"

        }
        cadena += "|\n"
    }

    return cadena
}