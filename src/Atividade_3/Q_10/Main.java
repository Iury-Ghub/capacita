package Atividade_3.Q_10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class LeitorArquivo{
    public static void abrirArquivo(String caminho){
        File arquivo = new File(caminho);

        try(Scanner leitor = new Scanner(arquivo)) {
            System.out.println("--- Contúdo do Arquivo ---");
            while (leitor.hasNextLine()){
                String linha = leitor.nextLine();
                System.out.println(linha);
            }
        }catch (FileNotFoundException e){
            System.err.println("Erro: O arquivo no caminho'" + caminho + "' não foi encontrado.");
        }catch (Exception e){
            System.err.println("Ocorreu um erro inesperado: "+ e.getMessage());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        LeitorArquivo.abrirArquivo("src/Atividade_3/Q_10/doc.txt");
    }
}
