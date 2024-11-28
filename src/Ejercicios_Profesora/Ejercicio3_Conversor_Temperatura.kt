package Ejercicios_Profesora

fun main(){
    ConversorCaF(27.0)
    ConversorKaC(350.0)
    ConversorFaC(10.0)
}


fun ConversorCaF(temperatura: Double) {
    var fa: Double
    fa = ((9 * temperatura) / 5) + 32
    val media = String.format("%.2f",fa)
    println("$temperatura grados celsius son $media grados Fahrenheit")
}
fun ConversorKaC(temperaturak: Double){
    var ce: Double
    ce = temperaturak -273.15
    val media = String.format("%.2f",ce)
    println("$temperaturak grados Kelvin son $media grados Celsius")

}
fun ConversorFaC(temperaturaf: Double){
    var fa: Double
    fa = ((5 * (temperaturaf-32) / 9) + 273.15)
    val media = String.format("%.2f",fa) // me saca dos decimales
    println("$temperaturaf grados Kelvin son $media grados Celsius")
}