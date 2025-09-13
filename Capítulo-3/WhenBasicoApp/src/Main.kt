fun descreverDia(dia: Int) {
    when (dia) {
        1 -> println("Domingo")
        2 -> println("Segunda-feira")
        3 -> println("Terça-feira")
        4 -> println("Quarta-feira")
        5 -> println("Quinta-feira")
        6 -> println("Sexta-feira")
        7 -> println("Sábado")
        else -> println("Dia inválido") // Obrigatório se when for uma expressão e não for exaustivo
    }
}

fun descreverNumero(num: Int): String {
    return when (num) { // 'when' como expressão, exigindo exaustividade
        1 -> "Um"
        2 -> "Dois"
        else -> "Outro número" // Ramo 'else' torna o 'when' exaustivo para Int
    }
}

fun main() {
    descreverDia(4) // Saída: Quarta-feira
    descreverDia(8) // Saída: Dia inválido

    println(descreverNumero(1)) // Saída: Um
    println(descreverNumero(5)) // Saída: Outro número
}