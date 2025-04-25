package br.com.alura.VeiculosFipe.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public record MarcasVeiculos(@JsonProperty("codigo") String codigo,
                             @JsonProperty("nome") String nome){

        @Override
        public String toString() {
                return "código=" + codigo + " | nome='" + nome;
        }
}