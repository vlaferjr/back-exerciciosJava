package lambdas_streams_frameworks.generics.classes_estatisticas;

import java.time.LocalDate;
import java.time.Period;

public class Aluno {
    //atributos
    private String nome;
    private LocalDate dataNascimento;

    //consrutor
    public Aluno(String nome, LocalDate dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    //Get de idade
    public int getIdade(){
        //fazendo o calculo do período entre a data atual e a data de nascimento
        Period periodo = Period.between(dataNascimento, LocalDate.now());
        return periodo.getYears();
    }

    //Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
