fun obterStatusIdade(idade: Int): String {
    val status = if (idade >= 18) {
        "Maior de idade"
    } else {
        "Menor de idade"
    }
    return status
}

// Forma ainda mais concisa, diretamente no corpo da função
fun obterCategoriaPeso(peso: Double): String = if (peso < 50.0) {
    "Leve"
} else if (peso < 75.0) {
    "Médio"
} else {
    "Pesado"
}

fun main() {
    println(obterStatusIdade(22)) // Saída: Maior de idade
    println(obterStatusIdade(15)) // Saída: Menor de idade
    println(obterCategoriaPeso(45.0)) // Saída: Leve
    println(obterCategoriaPeso(68.0)) // Saída: Médio
    println(obterCategoriaPeso(80.0)) // Saída: Pesado
}