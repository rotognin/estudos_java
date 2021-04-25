/**
 * Classe a ser extendida pelas subclasses
 */

package classes;

public class Esporte {
    // Descrição do esporte criado
    protected String descricao;

    // Contar quantos esportes foram iniciados
    public static int contagem;

    // Características do time que está sendo montado para o esporte
    public Time time;

    public static int getNumEsportes()
    {
        return Esporte.contagem;
    }

    public void getTime()
    {
        System.out.println("Time: " + time.getNome());
        System.out.println("Número de jogadores: " + time.getNumMaxJogadores());
    }

}
