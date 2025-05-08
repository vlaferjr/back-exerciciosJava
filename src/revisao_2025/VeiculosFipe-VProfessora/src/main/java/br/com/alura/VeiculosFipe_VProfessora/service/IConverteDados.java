package br.com.alura.VeiculosFipe_VProfessora.service;

public interface IConverteDados {
    //converter dados para uma classe
    <T> T obterDados (String json, Class<T>classe);
}
