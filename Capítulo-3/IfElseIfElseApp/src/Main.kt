fun classificarNota(nota: Int) {
    if (nota >= 90) {
        println("Excelente!")
    } else if (nota >= 70) {
        println("Bom!")
    } else if (nota >= 50) {
        println("Suficiente!")
    } else {
        println("Precisa melhorar!")
    }
}
fun main() {
    classificarNota(95) // Saída: Excelente!
    classificarNota(78) // Saída: Bom!
    classificarNota(50) // Saída: Suficiente!
    classificarNota(40) // Saída: Precisa melhorar!
}