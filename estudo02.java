/**
 * Estudando orientação a objetos
 * Montagem de times para Esportes diversos.
 * 
 * Ao montar um esporte, deverá ser informado o nome do time, o número de jogadores
 * e a descrição do mesmo.
 * Após isso, deve-se adicionar os jogadores para o time.
 */

import classes.Futebol;

public class estudo02 {
    public static void main(String[] args)
    {
        // Montar o primeiro time de futebol
        Futebol saoPaulo = new Futebol("São Paulo FC", 11, "Time da capital do Estado de São Paulo.");
        saoPaulo.getTime();
        saoPaulo.time.addJogador(1, "Adenilson", 7, "quarto zagueiro");
        saoPaulo.time.addJogador(2, "Paulo V", 10, "ataque");
        saoPaulo.time.addJogador(3, "Beto", 6, "volante");
        saoPaulo.time.imprimirJogadores();
    }
    
}
