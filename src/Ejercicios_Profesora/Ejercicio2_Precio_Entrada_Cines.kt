package Ejercicios_Profesora

fun main(){
    EntradaCine()
}

fun EntradaCine(){
    println( "Introduce tu Edad:" )
    var edad = readln().toInt()

    println( "Es lunes?" )
    val esLunes = readln().toBoolean()
    println ("El precio de la entrada al cine para una persona de $edad años es de ${calcularprecioEntrada(edad, esLunes)} euros")
    /*edad = readln().toInt()
    println ("El precio de la entrada al cine para una persona de $edad años es de ${calcularprecioEntrada(edad, esLunes)} euros")
    edad = readln().toInt()
    esLunes = readln().toBoolean()*/
}


fun calcularprecioEntrada(edad: Int, esLunes: Boolean):Float{
    return when(edad){
        in 0..12 -> 5.4f
        in 13..60 -> {
            if (esLunes) {
                6.7f
            }else {
                8.5f
            }
        }
        in 61..100 -> 5.0f
        else -> -1f
    }
}