package ejercicios

fun main(){
    var numeroPisos = 10
    var numeroVentanas = 4
    repeat(numeroVentanas*3+2){
        print("_")
    }
    println()
    repeat(numeroPisos) {
        print("|")
        repeat(numeroVentanas){
            print("_▋_")
        }
        println("|")
    }
}