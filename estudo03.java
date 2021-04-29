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
        entrada.close();

        return numero;
    }

    public static int segundaDigitacao() throws Exception
    {
        String texto = "";
        Scanner entrada = new Scanner(System.in);

        funcoes.escrever("Digite uma palavra");
        texto = entrada.nextLine();
        entrada.close();

        if (texto.length() == 0)
        {
            throw new Exception("Nenhum texto digitado");
        }

        return texto.length();

    }

    public static void main(String[] args) {
        int numero;
        Scanner entrada = new Scanner(System.in);    

        try {
            funcoes.escrever("Digite um número: ");
            numero = entrada.nextInt();
            funcoes.escrever("Primeiro número digitado: " + numero);
        }
        catch (InputMismatchException exc) {
            funcoes.escrever("Exceção: [ entrada incorreta de dados ]");
            exc.printStackTrace();
        }
        finally {
            funcoes.escrever("Fim da execução do bloco principal....");
            entrada.close();
        }

        funcoes.escrever("Executando o segundo bloco ------------ ");

        try{
            funcoes.escrever("Segundo número digitado:" + numeroDigitado());
        } catch (Exception exc) {
            exc.printStackTrace();
        }

        try {
            segundaDigitacao();
        } catch (Exception exc) {
            funcoes.escrever("Exceção capturada:");
            exc.printStackTrace();
        }
        

    }
}
