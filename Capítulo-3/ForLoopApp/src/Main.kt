fun main() {
    println("--- Kotlin: Laços de Repetição e Ranges ---")

    // 1.1. Inclusivo (..)
    println("\n--- 1.1. Range Inclusivo (..): Inclui o valor final ---")
    println("Sintaxe: 'start..end'")
    println("Exemplo: Contagem crescente de 1 a 5 (incluindo 5):")
    for (i in 1..5) { // De 1 até 5, incluindo 5
        print("$i ") // Saída: 1 2 3 4 5
    }
    println("\n")

    // 1.2. Exclusivo (until)
    println("\n--- 1.2. Range Exclusivo (until): Não inclui o valor final ---")
    println("Sintaxe: 'start until end'")
    println("Exemplo: Contagem de 1 até 4 (não incluindo 5):")
    for (i in 1 until 5) { // De 1 até 4, não incluindo 5
        print("$i ") // Saída: 1 2 3 4
    }
    println("\n")

    // 1.3. Decrescente (downTo)
    println("\n--- 1.3. Range Decrescente (downTo): Itens em ordem reversa ---")
    println("Sintaxe: 'start downTo end'")
    println("Exemplo: Contagem decrescente de 5 até 1 (incluindo 1):")
    for (i in 5 downTo 1) { // De 5 até 1, incluindo 1
        print("$i ") // Saída: 5 4 3 2 1
    }
    println("\n")

    // 1.4. Com Passo (step)
    println("\n--- 1.4. Range com Passo (step): Define o incremento/decremento ---")
    println("Sintaxe: 'range step value'")
    println("Exemplo 1: Contagem crescente com passo 2 (1, 3, 5, 7, 9):")
    for (i in 1..10 step 2) { // De 1 até 10, de 2 em 2
        print("$i ") // Saída: 1 3 5 7 9
    }
    println("\n")

    println("Exemplo 2: Contagem decrescente com passo 3 (10, 7, 4, 1):")
    for (i in 10 downTo 1 step 3) { // De 10 até 1, de 3 em 3
        print("$i ") // Saída: 10 7 4 1
    }
    println("\n")

    // --- Iterando Coleções ---
    println("\n--- 2. Iterando Coleções ---")

    // 2.1. Iterando Listas
    println("\n--- 2.1. Iterando Listas (List<T>) ---")
    val frutas = listOf("Maçã", "Banana", "Laranja", "Pera")
    println("Exemplo: Iterando uma lista de frutas:")
    println("Minhas frutas favoritas:")
    for (fruta in frutas) {
        println("- $fruta")
    }
    /* Saída Esperada:
    - Maçã
    - Banana
    - Laranja
    - Pera
    */

    // 2.2. Iterando Mapas
    println("\n--- 2.2. Iterando Mapas (Map<K, V>) ---")
    val mapa = mapOf("um" to 1, "dois" to 2, "três" to 3)
    println("\nElementos do mapa:")
    for ((chave, valor) in mapa) { // Desestruturação de pares chave-valor
        println("Chave: $chave, Valor: $valor")
    }
    /* Saída Esperada (sem aspas na chave, como no seu exemplo original):
    Chave: um, Valor: 1
    Chave: dois, Valor: 2
    Chave: três, Valor: 3
    Chave: quatro, Valor: 4
    */

    // 2.3. Iterando com Índices (withIndex())
    println("\n--- 2.3. Iterando com Índices (withIndex()) ---")
    println("A função 'withIndex()' permite acessar tanto o elemento quanto seu índice na iteração.")
    val cores = arrayOf("Vermelho", "Verde", "Azul", "Amarelo")
    println("Exemplo: Cores com seus respectivos índices:")
    for ((index, cor) in cores.withIndex()) {
        println("Cor no índice $index: $cor")
    }
    /* Saída Esperada:
    Cor no índice 0: Vermelho
    Cor no índice 1: Verde
    Cor no índice 2: Azul
    Cor no índice 3: Amarelo
    */

    println("\n\n--- Fim dos Exemplos de Laços de Repetição e Ranges ---")
}