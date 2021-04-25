/**
 * Definição dos times que serão adicionados aos esportes
 */

package classes;

public final class Time {
    private String nome;
    private int numMaxJogadores;
    private int numJogadores;
    private int timeId = 0;
    private Jogador[] jogador;

    public Time(String nome, int numMaxJogadores, int timeId)
    {
        this.nome = nome;
        this.numMaxJogadores = numMaxJogadores;
        this.timeId = timeId;
        this.jogador = new Jogador[numMaxJogadores];
        this.numJogadores = 0;

        int contar;

        for (contar = 0; contar < this.numMaxJogadores; contar++)
        {
            this.jogador[contar] = new Jogador();
            this.jogador[contar].setJogador(0, "", 0, "");
        }
    }

    public int getTimeId()
    {
        return this.timeId;
    }

    public String getNome()
    {
        return this.nome;
    }

    public int getNumMaxJogadores()
    {
        return this.numMaxJogadores;
    }

    public boolean addJogador(int idJogador, String nome, int numero, String posicao)
    {
        if (this.numJogadores == this.numMaxJogadores)
        {
            return false;
        }

        this.jogador[this.numJogadores].setJogador(idJogador, nome, numero, posicao);
        this.numJogadores++;
        return true;
    }

    public void imprimirJogadores()
    {
        System.out.println("--- Jogadores ---");

        int contar;
        int sequencia = 0;

        for (contar = 0; contar < this.numMaxJogadores; contar++)
        {
            sequencia++;

            if (this.jogador[contar].getIdJogador() > 0) {
                System.out.println("[" + sequencia + "] -> " + 
                                   this.jogador[contar].getNumero() + " - " + 
                                   this.jogador[contar].getNome()   + " - " +
                                   this.jogador[contar].getPosicao());
            } else {
                System.out.println("[" + sequencia + "] -> [ --- posição vazia --- ]");
            }
        }
    }
}
