package acelerazg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws IOException, ParseException {
        ArrayList<Card> listaDeCards = new ArrayList<Card>();
        BufferedReader leitura = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("*** Menu Inicial ***\n" +
                "Atualmente, vc tem " + listaDeCards.size() + " cards na sua coleção." +
                "\n1. Adicionar um novo card" +
                "\n2. Mostrar cards por prioridade" +
                "\n3. Excluir card" +
                "\nDigite a opção desejada: ");
        int escolhaMenu = Integer.parseInt(leitura.readLine());

        switch (escolhaMenu){
            case 1:
                System.out.println("Digite o número de cards que deseja adicionar: ");
                int numeroAddCards = Integer.parseInt(leitura.readLine());
                for(int i = 0; i <= numeroAddCards; i++){
                    Card card = new Card();
                    cadastroCard(card, leitura);
                    listaDeCards.add(card);
                    rebalanceamento(listaDeCards);
                    System.out.println("Card adicionado com sucesso!");
                }

            case 2:
                mostrarCards(listaDeCards);
                break;

            case 3:
                removerCard(listaDeCards, leitura);
                break;

            default:
                throw new IllegalStateException("Valor inválido: " + escolhaMenu);
        }
    }

    public static void cadastroCard(Card card, BufferedReader leitura) throws IOException, ParseException {
        System.out.print("*** Cadastro de Card ***\n" +
                "Digite o nome do card: ");
        card.setNome(leitura.readLine());
        System.out.print("Digite a descrição: ");
        card.setDescricao(leitura.readLine());
        System.out.print("Digite a categoria: ");
        card.setCategoria(leitura.readLine());
        System.out.print("Digite a prioridade ( 1 a 5 ): ");
        int numeroValidaPrioridade = Integer.parseInt(leitura.readLine());
        if(numeroValidaPrioridade >= 1 || numeroValidaPrioridade <= 5){
            card.setPrioridade(numeroValidaPrioridade);
        }
        else{
            throw new IOException("Número de prioridade inválido!");
        }
        System.out.print("Digite a data de término: ");
        String inputData = leitura.readLine();
        Date dataTermino = new SimpleDateFormat("dd/MM/yyyy").parse(inputData);
        card.setDataTermino(dataTermino);
        card.setarStatus(leitura);
    }

    public static void mostrarCards(ArrayList listaDeCards){
        for(Object c : listaDeCards){
            System.out.println(c.toString());
        }
    }

    public static void removerCard(ArrayList listaDeCards, BufferedReader leitura) throws IOException {
        System.out.print("Digite o número do card que deseja remover: ");
        int i = Integer.parseInt(leitura.readLine());
        listaDeCards.remove(i - 1);
        System.out.println("Card removido com sucesso!");
    }

    public static void rebalanceamento(ArrayList listaDeCards){
        Collections.sort(listaDeCards);
    }
}