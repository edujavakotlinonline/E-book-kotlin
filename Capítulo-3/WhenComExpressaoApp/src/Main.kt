fun obterNomeMes(numeroMes: Int): String {
    return when (numeroMes) {
        1 -> "Janeiro"
        2 -> "Fevereiro"
        3 -> "Março"
        4 -> "Abril"
        5 -> "Maio"
        6 -> "Junho"
        7 -> "Julho"
        8 -> "Agosto"
        9 -> "Setembro"
        10 -> "Outubro"
        11 -> "Novembro"
        12 -> "Dezembro"
        else -> "Mês inválido" // Obrigatório, pois nem todos os inteiros são meses.
    }
}

fun main() {
    println(obterNomeMes(7))  // Saída: Julho
    println(obterNomeMes(13)) // Saída: Mês inválido
}