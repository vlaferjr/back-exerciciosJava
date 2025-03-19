package OrientacaoObjeto2.exceptions.gitHub;

public class ErroConsultaGitHubException extends RuntimeException{

    private String mensagem = "Usuário não encontrado, tente novamente!";

    public ErroConsultaGitHubException(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return this.mensagem;
    }
}
