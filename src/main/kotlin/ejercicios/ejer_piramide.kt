package ejercicios

fun main(args: Array<String>) {
    writeLevel(10)
}

fun writeLevel(size : Int){
    repeat(size){
        writeFloorRight(it, size)
        writeFloorLeft(it)
        println()
    }
}

fun writeFloorLeft(floor : Int){
    repeat(floor) {
        print("_")
    }
    print("\\")
}

fun writeFloorRight(floor : Int, size: Int){
    repeat(size - floor) {
        print(" ")
    }
    print("/")
    repeat(floor) {
        print("_")
    }
}