/**
 * Ler e gravar arquivos texto
 * Referência: https://www.w3schools.com/java/java_files.asp
 */

import java.io.File;
import java.io.FileWriter;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class estudo01
{
    public static void processarArquivo(String arq)
    {
        // Abrir o arquivo para escrita
        try
        {
            FileWriter arquivo = new FileWriter(arq);
            Scanner texto = new Scanner(System.in);
            String mensagem;
            funcoes.escrever("Digite o texto a ser escrito no arquivo:");
            mensagem = texto.nextLine();
            texto.close();

            if (!mensagem.isEmpty()){
                arquivo.write(mensagem);
                funcoes.escrever("Texto escrito no arquivo.");
            }
           
            arquivo.close();
        }
        catch (IOException exc){
            funcoes.escrever(exc.getMessage());
        }
    }

    public static void main(String[] args)
    {
        funcoes.escrever("Hello World");

        // Ler um arquivo txt
        try
        {
            String arq = "texto01.txt";
            File arquivo = new File(arq);

            if (arquivo.createNewFile()){
                funcoes.escrever("Arquivo criado com sucesso!");
            } else {
                funcoes.escrever("Arquivo já existente.");
            }

            if (arquivo.exists()){
                // A partir daqui, trabalhar com o arquivo
                processarArquivo(arq);
            }
        } catch (IOException exc) {
            funcoes.escrever("Exceção ocorrida: " );
            exc.printStackTrace();
        }
    }
}