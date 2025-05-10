package br.com.alura.VeiculosFipe_VProfessora.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

//uso do ignore para ignorar a propriedade anos
@JsonIgnoreProperties(ignoreUnknown = true)
public record ModelosVeiculo(List<DadosVeiculo> modelos) {
}
