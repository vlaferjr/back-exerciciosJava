package lambdas_streams_frameworks.generics.caixa;

//armazena valor do tipo desconhecido
public class Caixa <T> {
    private T conteudo;

    //getters e setters

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    /*método que soma o conteúdo de Caixa (se Integer ou Double)
    ou só concatena se for String
     */
    public <T> T somaConteudoCaixa (T valor){
        //se conteúdo for integer e valor for integer
        if (this.conteudo instanceof Integer c && valor instanceof Integer i){
            //soma conteúdo com valor
            Integer resultado = c + i;
            //retorna resultado
            return (T) resultado;
            //senão se conteúdo e valor forem Double
        } else if (this.conteudo instanceof Double c  && valor instanceof Double d) {
            //soma c + d
            Double resultado = c + d;
            //retorna resultado
            return (T) resultado;
            //senão se conteúdo e valor forem String
        } else if (this.conteudo instanceof String c && valor instanceof String s) {
            //concatena c com S
            String resultado = c + "\n" + s;
            //retorna resultado
            return (T) resultado;
        }
        return null;
    }
}
