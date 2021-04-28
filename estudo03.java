/**
 * Tratamento de exceções
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class estudo03{
    public static int numeroDigitado() throws InputMismatchException
    {
        int numero = 0;
        Scanner entrada = new Scanner(System.in);

        funcoes.escrever("Digite um número:");
        numero = entrada.nextInt();

        return numero;
    }

    public static void main(String[] args) {
        try {
            int numero;
            Scanner entrada = new Scanner(System.in);
            funcoes.escrever("Digite um número: ");
            numero = entrada.nextInt();
            funcoes.escrever("Primeiro número digitado: " + numero);
            entrada.close();
        }
        catch (InputMismatchException exc) {
            funcoes.escrever("Exceção: [ entrada incorreta de dados ]");
            exc.printStackTrace();
        }
        finally {
            funcoes.escrever("Fim da execução do bloco principal....");
        }

        funcoes.escrever("Executando o segundo bloco ------------ ");

        try{
            funcoes.escrever("Segundo número digitado:" + numeroDigitado());
        } catch (Exception exc) {
            exc.printStackTrace();
        }
        

    }
}
