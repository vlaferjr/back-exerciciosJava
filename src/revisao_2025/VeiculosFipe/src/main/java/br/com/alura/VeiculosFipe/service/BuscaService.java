package br.com.alura.VeiculosFipe.service;

import br.com.alura.VeiculosFipe.model.MarcasVeiculos;
import br.com.alura.VeiculosFipe.principal.Principal;
import org.jetbrains.annotations.NotNull;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class BuscaService {

    private final Principal principal;

    public BuscaService(@Lazy Principal principal) {
        this.principal = principal;
    }

    //Buscando a marca escolhida
    public List<String> buscaMarcaModelo(String escolha, @NotNull List<MarcasVeiculos> dadosVeiculos){
        List<MarcasVeiculos> listaEscolhida = dadosVeiculos.stream()
                //filtrando a marca digitada e convertendo para minúscula
                .filter(dado -> dado.nome().toLowerCase().equals(escolha.toLowerCase()))
                //coletando numa nova lista
                .collect(Collectors.toList());
        //imprimindo a marca escolhida
        System.out.println("O escolhido foi: " + listaEscolhida);
        //tirando o código da marca escolhida
        List<String> codigoEscolhido = listaEscolhida.stream()
                //pegando o código da marca
                .map(MarcasVeiculos::codigo)
                //imprimindo o código
                .peek(System.out::println)
                //coletando numa nova lista
                .collect(Collectors.toList());
        if(!codigoEscolhido.isEmpty()){
            //retornando o código pego para o método consumirApiModelos
            return Collections.singletonList((codigoEscolhido.get(0)));
        } else {
            System.out.println("Nenhuma marca encontrada.");
            return Collections.emptyList();
        }
    }
}
