package Ejercicios

fun main(){
    obtenerPrecioEntrada(5)
    obtenerPrecioEntrada(28)
    obtenerPrecioEntrada(61)

   obtenerPrecioEntrada(102)

    println( "Introduce tu edad")
    val edad = readln().toInt()
    obtenerPrecioEntrada(edad)
}

fun obtenerPrecioEntrada(edad: Int){
    when(edad){
        in 0..12 -> println ("El precio de la entrada al cine para una persona de $edad años es de 5.4 Euros.")
        in 13..60 -> println ("El precio de la entrada al cine para una persona de $edad años es de 8.5 Euros.")
        in 61..100 -> println ("El precio de la entrada al cine para una persona de $edad años es de 5 Euros.")
        !in 0..100 -> println ("El precio de la entrada al cine para una persona de $edad años es de -1")
    }
}