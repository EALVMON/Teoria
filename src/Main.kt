
fun main() {

    //tiposVariables()
    //variablesSinTipo()
    variablesConTipo()
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