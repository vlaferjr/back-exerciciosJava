package orientacaoAObjeto.classes;

public class OoAluno {
    //recebendo os parâmetros enviados de Execução
    void infoAlunos(String nome, int idade){
        System.out.println("******** INFORMAÇOES DO ALUNO ********");
        System.out.println("O aluno %s tem %d anos de idade".formatted(nome, idade));
    }
}
