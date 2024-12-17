package orientacaoAObjeto.Getters_Setters;

public class Aluno {
    private String nomeAluno;
    private double nota1;
    private double nota2;
    private double nota3;

    //Construtor da classe
    public Aluno(String nomeAluno, double nota1, double nota2, double nota3) {
        this.nomeAluno = nomeAluno;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double calculaMedia(){
        return (this.nota1 + this.nota2 + this.nota3)/3;
    }
}
