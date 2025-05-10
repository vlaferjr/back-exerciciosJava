package br.com.alura.VeiculosFipe_VProfessora.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//ignorar propriedades não usadas
@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosCompletosVeiculo(@JsonAlias ("Valor") String valor,
                                    @JsonAlias ("Marca") String marca,
                                    @JsonAlias ("Modelo") String modelo,
                                    @JsonAlias ("AnoModelo") Integer anoModelo,
                                    @JsonAlias ("Combustivel") String combustivel) {
}