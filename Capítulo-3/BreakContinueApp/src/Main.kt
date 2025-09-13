fun main() {
    // --- Controle de Fluxo em Loops (break e continue) ---
    // break
    println("Exemplo: Parando o loop quando 'i' for igual a 5:")
    for (i in 1..10) {
        if (i == 5) {
            println("\n  (break acionado, loop será encerrado)")
            break // Sai do loop quando i for 5
        }
        print("$i ") // Saída: 1 2 3 4
    }
    println("Loop 'break' encerrado.")
    println("\n------------------------------")
    // continue
    println("Exemplo: Imprimindo apenas números ímpares (pulando os pares):")
    for (i in 1..10) {
        if (i % 2 == 0) { // Se i for par
            // println("  (continue acionado para $i)") // Descomente para ver quando o continue é acionado
            continue // Pula para a próxima iteração
        }
        print("$i ") // Saída: 1 3 5 7 9
    }
    println("\nLoop 'continue' concluído.")
}