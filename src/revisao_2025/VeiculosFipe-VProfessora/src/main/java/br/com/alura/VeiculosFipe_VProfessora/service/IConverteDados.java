package br.com.alura.VeiculosFipe_VProfessora.service;

import java.util.List;

public interface IConverteDados {
    //converter dados para uma classe
    <T> T obterDados (String json, Class<T>classe);

    //obter uma lista de dados
    <T> List<T> obterLista(String json, Class<T> classe);
}
