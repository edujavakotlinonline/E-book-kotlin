fun somar(a: Int, b: Int): Int = a + b
// Ou, com inferência de tipo:
fun subtrair(a: Int, b: Int) = a - b

fun main() {
    println("Soma: ${somar(10, 5)}")     // Saída: Soma: 15
    println("Subtração: ${subtrair(10, 5)}") // Saída: Subtração: 5
}