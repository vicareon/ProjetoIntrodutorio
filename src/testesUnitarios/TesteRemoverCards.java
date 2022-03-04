package testesUnitarios;

import acelerazg.Card;
import org.junit.Test;

import java.util.ArrayList;

public class TesteRemoverCards {
    //given
    ArrayList<Card> listaDeCards = new ArrayList<Card>();
    Card cardTeste1 = new Card("Card Teste 1", "Descrição Teste 1", "Categoria Teste 1", "A Fazer", 3);
    Card cardTeste2 = new Card("Card Teste 2", "Descrição Teste 2", "Categoria Teste 2", "Em Progresso", 3);
    Card cardTeste3 = new Card("Card Teste 3", "Descrição Teste 3", "Categoria Teste 3", "Feito", 3);

    //when
    @Test
    public void testeRemoverCards(){
        listaDeCards.add(cardTeste1);
        listaDeCards.add(cardTeste2);
        listaDeCards.add(cardTeste3);

        listaDeCards.remove(2);

        int tamanhoEsperado = 2;
        int tamanhoAtual = listaDeCards.size();

        //comparação se o tamanho esperado de cards é o mesmo do atual
        boolean resultado = (tamanhoAtual == tamanhoEsperado);

        //then
        System.out.println(resultado);
    }
}
