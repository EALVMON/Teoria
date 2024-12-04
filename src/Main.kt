import java.util.Scanner

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
    //obtenerNombreMesWhen(1)
    arrays()
    entradaReadLine()
    mapasInmutable()

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

fun entradaConScanner(){

    //inicializar scanner
    val scanner =Scanner(System.`in`)

    //leer una linea

    val linea = scanner.nextLine()
    println(linea)

    // Leer un string

    val string = scanner.next()
    println(string)

    // leer un numero entero

    val numero = scanner.nextInt()
    println(numero)
}


fun arrays(){

    // como se definen

    val semana = arrayOf("Lunes","martes","Miercoles", "Jueves","Viernes","sabado","domingo")
    println(semana.get(0))
    println(semana[1])
   // println(semana[7]) produce excepcion ya que va del 0 al 6
    // modificar datos de las posiciones que ya existen
    println("Tamaño del array" + semana.size)
    semana.set(0, "Luessss") // modifico
    println(semana[0])
    // lo que no deja es meter mas datos de los declarados en el array al principio
    // mi array lo cree de 7 elementos y no puedo ni quitar ni añadir en este tipo de arrays
    val numeros = (0..100).toList() // Convierte el rango a una lista
    println(numeros[0]) // Ahora puedes acceder al primer elemento
    // recorrer array por posicion
    for (posicion in semana.indices){
        println(semana.get(posicion))

    }

    // recorrer en una sola interacion ver la posicion y el valor que tiene
    for ((posicion,valor) in semana.withIndex()) {
        println(" la posicion $posicion y tiene el $valor ")

    }

    // Recorrer obteniendo directamente el valor

    for (valor in semana){
        println(" El Valor es $valor")
        println(valor)

    }


}
fun entradaReadLine(){
    // es mejor que el  anterior para leer
    println( "Introduce tu nombre")
    val nombre =readln() // leer string

    // lee un string y lo convierte a numero
    println( "Introduce tu edad")
    val edad = readln().toInt()

    println( "Hola, $nombre y mi edad es $edad años")
}
// listas Inmutables

    fun listasInmutables(){

        val semana : List<String> = listOf("Lunes","martes","Miercoles", "Jueves","Viernes","sabado","domingo")
        // funciones mas habituales
        println(semana.get(0)) // nos devuelve el elemento de la posicion 0
        println ("Tamaño de laq Lista:" + semana.size)
        println("Primer elemento " + semana.first()) // primer elemento
        println("Ultimo elemento " +semana.last()) // segundo elemento

    }

// Los hay mutables e inmutables

fun mapasInmutable (){ // la clave es unica
    val mapa = mapOf(1 to "uno", 2 to "dos", 3 to "tres") // esta formado por pares de datos CLAVE y valore
    println (mapa.entries)
    println(mapa.keys)
    println(mapa.values)
    println(mapa.count() + mapa.size)
    println(mapa[1])
    println(mapa.getValue(1))

}

fun mapasMutable (){ // la clave es unica
    val mapa = mutableMapOf<Int, String>()
    mapa.put(1,"UNO")
    mapa.put(2,"DOS")
    mapa.put(3,"TRES")
    println(mapa)
    mapa.put(1,"ONE") // MACHACA EL VALOR YA QUE LA CLAVE ES UNICA
    println(mapa)
    for (numero in mapa){ // lo recorro
        println("${numero.key}- ${numero.value}")

    }

    // ver los apuntes hay mas metodos

}

// Listas mutables son las mas utilizadas pero menos eficientes

fun listasMutables() {
    val semana: MutableSet<String> =
        mutableSetOf("Lunes", "martes", "Miercoles", "Jueves", "Viernes") // tambien se puede poner listOf
// otra forma de crear listas mutables

    val semana1: ArrayList<String> = arrayListOf("Lunes", "martes", "Miercoles", "Jueves", "Viernes")
// añadir y eleminar elementos

    semana.add("Domingo") // al fijnal de la lista
    semana1.add( 5, "Sabado") // lo añado en la posicion 5




    if (semana.none()) { // si no tiene elementos
        println("Lista vacia")
    }
    println(semana.first())
    println(semana.firstOrNull())// si no hay nada nos devuelve null mejor asi poara que no tengamos errores si no hay nada
    println(semana1.elementAtOrNull(4))

    // quiero obtener los dias de la semana que empiezen por M
    val resultado = semana1.filter {
        it [0].lowercase() == "M".lowercase() // me da igual que la M este ne mayuscula o en miniscula
        // It es una variable interna que tiene kotlin y esta en alfuna funciones filter que es una funcion como en esta y repersenta cada uno de los elementos
        it == "sabado " || it =="domingo" // en resulatdo guarda una lista con los reltados
    }
    println(resultado)

    // Recorer Listas

    for( valor in semana){
        println(valor)
    }

    // me falta poner el de valor y posicion

    // for each
    val nuevaLista: MutableList<String> = mutableListOf()
    semana.forEach{ // es algo parecido al filter
        nuevaLista.add(it + "-")    // cojo los valores de la lista anterior y los meto en esta

    }
   semana.addAll(nuevaLista) //
    println(nuevaLista)
}
fun rangos (){

    for (x in 0 .. 10){
        print(x)
    }

    for (x in 0 until  10){
        print(x)
    }

    for (x in 0..10 step 2 )  {
        print(x)
    }

    for (x in 10 downTo 0 step 2 )  {
        print(x)
    }

    var x=0
    while(x < 10){
        println(x)
        x++
        //continue
        //break
    }
}

fun nullsafety(){

    var cadena : String?= "Esto es una cadena"
    // esto me permite ponerla a null
        cadena = null
    println(cadena?.length)
    cadena.let { // se ejecuta si cadena no es nulo
        println(it) // it almacena el valor de la propia cadena
        // en java viene a ser (a>10) ? true : false operador ternario
    } ?:run{ // se ejecutaria cuando cadena sea nulo
        println(cadena)
    }
}

// funciones lamda son las que utiliza el it pero tambien las podemos crear nosotros

fun funcionLambda(){

    //  {parametros1 : tipo , paramero2: tipo -> ( hay que poner la flecha) parametro 1 + pàramerto2 }
    // de esta manera definimos nuestra funcion lanbda
    // si nuestra funcion no tiene parametros no hace
    // ejemplo
    val listaNumeros = arrayOf(0,1,2,3,4,5)
    val listaNumerosFiltrados = listaNumeros.filter { miEntero: Int ->
       // me filtra los numeros mayores de 5 y el 1
        if (miEntero == 1){
            return@filter true // para que lo vuelva hacer el filtro que no se acabe aunque encuentre el 1
        }
        miEntero > 4 // el resultado que devuelve esta en la ultima linea
    }

    println(listaNumeros)
}




