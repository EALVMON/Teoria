package FuncionesLambda

fun main(){
    conversorTemperatura()

}


fun conversorTemperatura() {
    println( "Introduce los grados:" )
    var grados = readln().toDouble()

    println( "Introduce la Escala Inicial:" )
    var escalaInicial = readln().toString()

    println( "Introduce la Escala Final:" )
    var escalaFianl = readln().toString()

    convertirTemperatura(grados, escalaInicial, escalaFianl)

}


fun convertirTemperatura(grados:Double, escalaInicial: String, escalaFianl:String) {

    val medida: Double = when (escalaInicial){
        "Celsius" -> 9.0 / 5.0 * grados + 32
        "Kelvin" -> grados-273.15
        else ->  5.0/9.0 * (grados-32)+ 273.15
    }
    val medidadFinal = String.format("%.2f", medida)
    println("$grados grados $escalaInicial son $medidadFinal grados  $escalaFianl")

}