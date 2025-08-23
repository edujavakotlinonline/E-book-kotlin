fun main() {
    // 1. Declare três variáveis val para as notas das provas.
    // O tipo Double é o mais adequado para números com casas decimais.
    val nota1: Double = 7.5
    val nota2: Double = 8.0
    val nota3: Double = 6.0

    // 2. Calcule a média das três notas usando operadores aritméticos.
    // Usamos 3.0 para garantir que a divisão seja de ponto flutuante.
    val mediaCalculada: Double = (nota1 + nota2 + nota3) / 3.0

    // 3. Declare uma variável val para a média mínima de aprovação.
    val mediaMinimaAprovacao: Double = 7.0

    // 4. Usando um operador de comparação, determine se o aluno foi aprovado.
    // O resultado será um valor booleano (true ou false).
    val alunoAprovado: Boolean = mediaCalculada >= mediaMinimaAprovacao

    // 5. Imprima as notas, a média calculada e o status de aprovação.
    println("Notas do Aluno: $nota1, $nota2, $nota3") // Saída Esperada: 7.5, 8.0, 6.0
    println("Média Calculada: $mediaCalculada")       // Saída Esperada: 7.166666666666667
    println("Média Mínima para Aprovação: $mediaMinimaAprovacao") // Saída Esperada: 7.0
    println("Aluno Aprovado: $alunoAprovado")         // Saída Esperada: true
}