fun avaliarClima(temperatura: Int, estaChovendo: Boolean) {
    when {
        temperatura > 30 && !estaChovendo -> println("Dia quente e ensolarado!")
        temperatura > 20 && estaChovendo -> println("Calor com chuva, abafado.")
        temperatura in 10..20 && !estaChovendo -> println("Clima agradável.")
        else -> println("Clima desconhecido ou complexo para classificar.")
    }
}

fun main() {
    avaliarClima(32, false) // Saída: Dia quente e ensolarado!
    avaliarClima(25, true)  // Saída: Calor com chuva, abafado.
    avaliarClima(15, false) // Saída: Clima agradável.
    avaliarClima(5, true)   // Saída: Clima desconhecido ou complexo para classificar.
}