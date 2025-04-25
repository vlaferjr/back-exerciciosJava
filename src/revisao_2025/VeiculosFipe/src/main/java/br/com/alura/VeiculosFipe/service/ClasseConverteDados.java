package br.com.alura.VeiculosFipe.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ClasseConverteDados implements InterfaceConverteDados{

    //ObjectMapper é uma classe usada para converter json no Jackson
    private ObjectMapper mapper = new ObjectMapper();
    @Override
    //implementação da InterfaceConverteDados
    public <T> List<T> obterDados(String json, Class<T> classe) {
        try {
            //tentear converter os dados do json em lista classes
            /*Json -> parâmetro passado do Application obtido no consumo da API
            * TypeReferente ->  deserializar o JSON em uma lista de objetos do tipo T*/
            return mapper.readValue(json, mapper.getTypeFactory().constructCollectionType(List.class, classe));
        }
        //se não for possível e der exceção, tratar exceção
        catch (IOException e){
            e.printStackTrace();
            // Retorna uma lista vazia em caso de erro
            return Collections.emptyList();
        }

    }
}
