fun classificarIdade(idade: Int) {
    when (idade) {
        in 0..12 -> println("Criança")
        in 13..17 -> println("Adolescente")
        in 18..64 -> println("Adulto")
        !in 0..150 -> println("Idade fora do alcance humano razoável") // Exemplo de !in
        else -> println("Idoso") // Acima de 64 (e dentro do alcance razoável)
    }
}

fun main() {
    classificarIdade(10)  // Saída: Criança
    classificarIdade(16)  // Saída: Adolescente
    classificarIdade(21)  // Saída: Adulto
    classificarIdade(70)  // Saída: Idoso
    classificarIdade(200) // Saída: Idade fora do alcance humano razoável
}