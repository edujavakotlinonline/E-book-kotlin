fun verificarStatus(saldo: Double) {
    if (saldo > 0) {
        println("Sua conta está positiva.")
    } else {
        println("Sua conta está negativa ou zerada.")
    }
}
fun main() {
    verificarStatus(150.0) // Saída: Sua conta está positiva.
    verificarStatus(-20.0) // Saída: Sua conta está negativa ou zerada.
}
