package Ejercicios_Profesora

fun main(){

    println( "Introduce tus notificaciones")
    var notificaciones = readln().toInt()

    notificaciones(notificaciones)

    println( "Introduce tus notificaciones")
    notificaciones = readln().toInt()
    notificaciones2(notificaciones)

}

fun notificaciones (numero: Int){
    when(numero){

        in 0..99 -> println ("Tienes  $numero notificaciones.")
       !in 0..99 -> println("¡ Tu telefono esta explotando! Tienes 99+ notificaciones.")
    }

    }


fun notificaciones2 (numero: Int){

    if (numero <=99){
        println ("Tienes  $numero notificaciones.")
    } else {
        println("¡ Tu telefono esta explotando! Tienes 99+ notificaciones.")
    }


}