/**
 * Definição dos jogadores que serão adicionados aos times
 */

package classes;

public final class Jogador {
    private int idJogador = 0;
    private String nome;
    private int numero;
    private String posicao;

    public Jogador(){}

    public void setJogador(int idJogador, String nome, int numero, String posicao)
    {
        this.idJogador = idJogador;
        this.nome = nome;
        this.numero = numero;
        this.posicao = posicao;
    }

    public int getIdJogador()
    {
        return this.idJogador;
    }

    public String getNome()
    {
        return this.nome;
    }

    public int getNumero()
    {
        return this.numero;
    }

    public String getPosicao()
    {
        return this.posicao;
    }
}
