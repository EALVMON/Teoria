fun main(){
    Ejercicios.notificaciones(56)
    Ejercicios.notificaciones(102)

    Ejercicios.notificaciones2(3000)
    Ejercicios.notificaciones2(32)

    Ejercicios.notificaciones3(1000)
    Ejercicios.notificaciones3(85)
}

fun notificaciones (numero: Int){
    when(numero){
        in 0..99 -> println ("Tienes  $numero notificaciones.")
        !in 0..99 -> println("¡ Tu telefono esta explotando! Tienes 99+ notificaciones.")
    }


    }

fun notificaciones2(numero: Int) {
    when (numero) {
        in 0..99 -> println("Tienes $numero notificaciones.")
        else -> println("¡Tu teléfono está explotando! Tienes 99+ notificaciones.")
    }
}

fun notificaciones3(numero: Int) {
    when {
        numero in 0..99 -> println("Tienes $numero notificaciones.")
        numero !in 0..99 -> println("¡Tu teléfono está explotando! Tienes 99+ notificaciones.")
    }
}