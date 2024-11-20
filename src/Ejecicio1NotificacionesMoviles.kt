fun main(){
    notificaciones(56)
    notificaciones(102)

    notificaciones2(3000)
    notificaciones2(32)

    notificaciones3(1000)
    notificaciones3(85)
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