/**
 * Ler e gravar arquivos texto
 * Referência: https://www.w3schools.com/java/java_files.asp
 */

import java.io.File;
import java.io.FileWriter;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class estudo01
{
    public static void escreverArquivo(String texto, String arquivo) throws IOException
    {
        Path caminho = Paths.get(arquivo);
        Files.write(caminho, texto.getBytes(), StandardOpenOption.APPEND);
    }

    public static void processarArquivo(String arquivo)
    {
        Scanner texto = new Scanner(System.in);
        String mensagem;
        funcoes.escrever("Digite o texto a ser escrito no arquivo:");
        mensagem = texto.nextLine();
        texto.close();

        try {
            escreverArquivo(mensagem + "\n", arquivo);
        } catch(IOException exc) {
            funcoes.escrever("Exceção ocorrida: " + exc.getMessage());
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