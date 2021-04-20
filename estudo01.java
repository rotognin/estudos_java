/**
 * Ler e gravar arquivos texto
 * Referência: https://www.w3schools.com/java/java_files.asp
 */

import java.io.File;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class estudo01
{
    public static void main(String[] args)
    {
        funcoes.escrever("Hello World");

        // Ler um arquivo txt
        try
        {
            File arquivo = new File("texto01.txt");
            if (arquivo.createNewFile()){
                funcoes.escrever("Arquivo criado con sucesso!");
            }
        } catch (IOException exc) {
            funcoes.escrever("Exceção ocorrida: " );
            exc.printStackTrace();
        }
    }
}