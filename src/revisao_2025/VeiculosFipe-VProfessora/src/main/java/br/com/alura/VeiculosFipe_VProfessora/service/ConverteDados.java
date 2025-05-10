package br.com.alura.VeiculosFipe_VProfessora.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;

import java.util.List;

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

    @Override
    public <T> List<T> obterLista(String json, Class<T> classe) {
        //pegar o json e Converter numa lista de objetos da Classe
        //construir uma coleção do tipo lista baseado na classe passada
        CollectionType lista = mapper.getTypeFactory()
                .constructCollectionType(List.class, classe);
        try {
            return mapper.readValue(json, lista);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
