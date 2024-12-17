package exceptions.senhainvalida;

public class SenhaInvalidaException extends RuntimeException{
    private String mensagem = "A senha deve possui 8 dígitos no máximo";

    public SenhaInvalidaException(String mensagem) {
        this.mensagem = mensagem;
    }
    public String getMensagem() {
        return this.mensagem;
    }
}
