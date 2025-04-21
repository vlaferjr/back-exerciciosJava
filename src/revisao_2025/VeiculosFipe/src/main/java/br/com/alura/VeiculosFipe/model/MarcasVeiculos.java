package br.com.alura.VeiculosFipe.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public record MarcasVeiculos(@JsonProperty("codigo") int codigo,
                             @JsonProperty("nome") String nome){

        @Override
        public String toString() {
                return "código=" + codigo + " | nome='" + nome;
        }
}