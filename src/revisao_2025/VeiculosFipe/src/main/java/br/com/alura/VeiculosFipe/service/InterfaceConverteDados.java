package br.com.alura.VeiculosFipe.service;

import java.util.List;

/*Interface genérica ConverteDados que vem do json para uma classe genérica*/
public interface InterfaceConverteDados {
    <T> List<T> obterDados (String json, Class<T> classe);
}

