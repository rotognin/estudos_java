/**
 * Classe principal que será instanciada pra cada time de futebol a ser montado.
 * 
 */

package classes;

public final class Futebol extends Esporte {
    // Número de times de futebol montados
    public static int numTimesFutebol = 0;

    public Futebol (String nome, int numJogadores, String descricao)
    {
        Futebol.numTimesFutebol++;
        this.time = new Time(nome, numJogadores, Futebol.numTimesFutebol);

        this.descricao = descricao;
        Esporte.contagem++;
    }

    public void getTime()
    {
        System.out.println("------ FUTEBOL ------");
        System.out.println("ID do Time: " + this.time.getTimeId());
        super.getTime();
        System.out.println("---------------------");
    }
}
