package orientacaoAObjeto.leitura_escrita_arquivo.exercicio1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) throws IOException {

        /*------ DIGITAÇÃO DO QUE SERÁ GRAVADO NO ARQUIVO ------*/
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o conteúdo a ser gravado no arquivo");
        String conteudo = leitura.nextLine();

        /*--------- GRAVAÇÃO NO ARQUIVO -------------*/
        FileWriter escrita = new FileWriter("conteudo.txt");
        escrita.write(conteudo);
        escrita.close();

        /*------------ IMPRIMIR CONTEÚDO NO CONSOLE----------- */
        System.out.println("O conteúdo impresso no txt foi: \n" + conteudo);
    }
}
