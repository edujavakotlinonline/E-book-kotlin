fun main() {
    println("--- Exemplo de break com rótulo: Parando a Contagem ---")
    lacoPrincipal@ for (i in 1..5) { // Este é o laço externo rotulado como 'lacoPrincipal'
        for (j in 1..5) {
            println("Contando: i = $i, j = $j")
            if (i == 3 && j == 2) {
                println("Condição especial atingida (i=3, j=2)! Parando TUDO.")
                break@lacoPrincipal // Sai completamente do 'lacoPrincipal'
            }
        }
    }
    println("Programa continuou após os laços.")

    /* Saída:
    --- Exemplo de break com rótulo: Parando a Contagem ---
    Contando: i = 1, j = 1
    Contando: i = 1, j = 2
    Contando: i = 1, j = 3
    Contando: i = 1, j = 4
    Contando: i = 1, j = 5
    Contando: i = 2, j = 1
    Contando: i = 2, j = 2
    Contando: i = 2, j = 3
    Contando: i = 2, j = 4
    Contando: i = 2, j = 5
    Contando: i = 3, j = 1
    Contando: i = 3, j = 2
    Condição especial atingida (i=3, j=2)! Parando TUDO.
    Programa continuou após os laços.
    */
}