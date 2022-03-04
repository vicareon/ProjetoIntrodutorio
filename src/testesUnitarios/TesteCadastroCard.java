package testesUnitarios;

import acelerazg.Card;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;



public class TesteCadastroCard {
    //given
    ArrayList<Card> listaDeCards = new ArrayList<Card>();
    Card cardTeste = new Card();

    //when
    @Test
    public void testeCadastroCard() throws ParseException {
        cardTeste.setNome("Cartão de Teste");
        cardTeste.setDescricao("Descrição de Teste");
        cardTeste.setCategoria("Categoria Teste");
        cardTeste.setPrioridade(5);
        cardTeste.setStatus("Status Teste");

        //para criar uma data em formato legível para mostrar no card
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        Date dataTermino = simpleDateFormat.parse("2022-06-30");
        cardTeste.setDataTermino(dataTermino);

        listaDeCards.add(cardTeste);

        //then
        assertEquals(true, listaDeCards.get(0).getNome().equals("Cartão de Teste"));
    }
}
