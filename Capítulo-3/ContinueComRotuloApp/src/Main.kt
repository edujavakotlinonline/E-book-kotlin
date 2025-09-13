fun main() {
    println("\n--- Exemplo de continue com rótulo: Pulando uma Rodada Externa ---")
    lacoPrincipal@ for (i in 1..5) { // Este é o laço externo rotulado como 'lacoPrincipal'
        println(">>> Iniciando rodada i = $i")
        for (j in 1..5) {
            if (i == 3 && j == 1) {
                println("  -> Condição especial atingida (i=3, j=1)! Pulando o resto desta rodada do laço externo.")
                continue@lacoPrincipal // Pula o restante da iteração atual do 'lacoPrincipal'
            }
            println("  Contando: i = $i, j = $j")
        }
        println("<<< Finalizando rodada i = $i") // Esta linha não será mostrada se o continue@lacoPrincipal for ativado
    }
    println("Programa continuou após os laços.")

    /* Saída:
    --- Exemplo de continue com rótulo: Pulando uma Rodada Externa ---
    >>> Iniciando rodada i = 1
      Contando: i = 1, j = 1
      Contando: i = 1, j = 2
      Contando: i = 1, j = 3
      Contando: i = 1, j = 4
      Contando: i = 1, j = 5
    <<< Finalizando rodada i = 1
    >>> Iniciando rodada i = 2
      Contando: i = 2, j = 1
      Contando: i = 2, j = 2
      Contando: i = 2, j = 3
      Contando: i = 2, j = 4
      Contando: i = 2, j = 5
    <<< Finalizando rodada i = 2
    >>> Iniciando rodada i = 3
      -> Condição especial atingida (i=3, j=1)! Pulando o resto desta rodada do laço externo.
    >>> Iniciando rodada i = 4
      Contando: i = 4, j = 1
      Contando: i = 4, j = 2
      Contando: i = 4, j = 3
      Contando: i = 4, j = 4
      Contando: i = 4, j = 5
    <<< Finalizando rodada i = 4
    >>> Iniciando rodada i = 5
      Contando: i = 5, j = 1
      Contando: i = 5, j = 2
      Contando: i = 5, j = 3
      Contando: i = 5, j = 4
      Contando: i = 5, j = 5
    <<< Finalizando rodada i = 5
    Programa continuou após os laços.
    */
}