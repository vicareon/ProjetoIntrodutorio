package testesUnitarios;

import acelerazg.Card;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

public class TesteMostrarCards {
    //given
    ArrayList<Card> listaDeCards = new ArrayList<Card>();
    Card cardTeste1 = new Card("Card Teste 1", "Descrição Teste 1", "Categoria Teste 1", "A Fazer", 3);
    Card cardTeste2 = new Card("Card Teste 2", "Descrição Teste 2", "Categoria Teste 2", "Em Progresso", 2);
    Card cardTeste3 = new Card("Card Teste 3", "Descrição Teste 3", "Categoria Teste 3", "Feito", 5);

    //when
    @Test
    public void testeMostrarCards(){
        listaDeCards.add(cardTeste1);
        listaDeCards.add(cardTeste2);
        listaDeCards.add(cardTeste3);

        Collections.sort(listaDeCards);

        for(Object c : listaDeCards){
            System.out.println(c.toString());
        }
    }
}
