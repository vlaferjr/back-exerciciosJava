package orientacaoAObjeto.leitura_escrita_arquivo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeitiuraArquivo {
    public static void main(String[] args) {
        try{
            //declaração do objeto arquivo para criar um arquivo de texto arquivo.json
            File arquivo = new File("arquivo.json");

            //objeto scanner lendo o arquivo
            Scanner scanner = new Scanner(arquivo);

            //enquanto existirem mais linhas para serem lidas
            while (scanner.hasNextLine()){
                //linha recebe scanner
                String linha = scanner.nextLine();
                //imprime no console o que foi lido do arquivo
                System.out.println(linha);
            }
            //fecha o Scanner, encerrando a leitura
            scanner.close();
        } catch (FileNotFoundException e){
            System.out.println("Arquivo não encontrado!");
        }
    }
}
