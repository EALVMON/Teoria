
fun main() {

    //tiposVariables()
    //variablesSinTipo()
    //variablesConTipo()
    //concatenacion()
    //ejercicio1pag37()
    //ejercicio2pag37()
    //ejercicio3pag37()
    //ejercicio2pag37_1("Alvarez")
    //println(obtenetTexto())
    obtenerNombreMesWhen(1)

}



fun concatenacion(){
    val saludo: String = "Hola me llamo " // se puede poner var (definir variables si no cambia mejor val) o val--> (para definir constantes)
    val nombre: String = "Edu"
    println("$saludo $nombre") // para accederr a string se pone $ delante
    val introduccion = "El resultado de "
    val plus = "más"
    val primerNumero:Int = 2
    val segundoNumero:Int = 5
    println("$introduccion $primerNumero $plus $segundoNumero es: ${primerNumero + segundoNumero}")
    println(introduccion + " " + primerNumero + " "+ plus + " " + segundoNumero + " es: "
    + (primerNumero + segundoNumero))
}

fun variablesSinTipo(){
    var num1 = 10
    var num2 = 5
    print("Suma: ")
    println(num1 + num2)
    print("Resta: ")
    println(num1 - num2)
    print("Multiplicacion: ")
    println(num1 * num2)
    print("Division: ")
    println(num1 / num2)
    print("Resto o modulo: ")
    println(num1 % num2)


}

fun variablesConTipo(){
    var num1: Int = 10
    var num2: Float  = 5.4f
    print("Suma: ")
    var resultado:Float = num1 + num2 // un ejemplo de como poner el resultado en otra variable
    var resultado2 = Math.round(num1 + num2) // me lo redondea
    println(resultado)
    print("Suma Redondeada: ")
    println(resultado2)
    print("Suma con .to en el resultado  : ")
    var resultado3 = (num1 + num2) .toInt() // Asi nos lo convierte a un numero entero
    println(resultado3)
    print("Suma con .to en una variable : ")
    var resultado4 = num1 + num2.toInt()  // es mejor aplicar el toInt al nnumero que es float para que nos salga un numero entero de resultado
    println(resultado4)
    print("Resta: ")
    println(num1 - num2)
    print("Multiplicacion: ")
    println(num1 * num2)
    print("Division: ")
    println(num1 / num2)
    print("Resto o modulo: ")
    println(num1 % num2)


}
fun tiposVariables(){
    // Variables Numericas
    var numeroInt: Int = 1 // tiene que ser Int en mayusculas
    var numeroLong: Long = 453678
    var numeroFloat: Float = 1.98f  // hasta 6 decimales y hay que añadir la letra f o F
    var numeroDouble: Double = 1.98 // hasta 14 decimales

    // variables de Texto

    var numeroChar: Char ='A' // solo almacena un caracter con comillas simples
        numeroChar ='1' // seria un caracter
        numeroChar =' ' // caracter espacio en blanco
    var cadena: String = "Una frase"
        cadena= "Otra frase" // le cambio el valor

    // Variables booleanas
    var valorVerdadero: Boolean = true
    var valorFalso: Boolean = false

    // Anulacion de variables si quiero que una variable tome el valor null
    // hay que convertir a las variable como nulables se hace poniendo ?
    // en el formato de varible en este caso String?
    var nombre: String? =null

}
// Ejercicios de los apuntes
fun ejercicio1pag37(){
    println("Me llamo Edu")
}
fun ejercicio2pag37(){
    println("Mi Apellido es Alvarez")
}
fun ejercicio3pag37(){
    println("Tengo 51 años")
}
fun ejercicio2pag37_1(apellido: String){
    println("Mi Apellido es $apellido")
}

fun obtenetTexto():String{
    return "Esto es un texto cualquiera"
}

fun obtenerNombreMesWhen(numeroMes: Int){
    when(numeroMes){

        1 -> println("Enero")
        2 -> println("Febreo")
        3 -> println("Marzo")
        4 -> println("Abril")
        5 -> println("Mayo")
        6 -> println("Junio")
        7 -> println("Julio")
        8 -> println("Agosto")
        9-> println("Septiembre")
        10 -> println("Octubre")
        11 -> println("Noviembre")
        12 -> println("Diciembre")
        else -> {
            println("No ha introducido un numero de mes correcto")
        }

    }
}

// Para leer es muy parecido a Java con el objeto system,in

