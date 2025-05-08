package br.com.alura.VeiculosFipe_VProfessora.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConverteDados implements IConverteDados{
    private ObjectMapper mapper = new ObjectMapper();
    //conversão do json para a classe que for determinada
    @Override
    public <T> T obterDados(String json, Class<T> classe) {
        try {
            //pegar o json, pegar a classe e tentar converter
            return mapper.readValue(json, classe);
        } catch (JsonProcessingException e) {
            //senão, trate o erro com a exceção
            throw new RuntimeException(e);
        }
    }
}
