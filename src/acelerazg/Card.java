package acelerazg;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Date;

public class Card implements Comparable<Card>{
    private String nome, descricao, categoria, status;
    private int prioridade;
    private Date dataTermino;

    public Card(){
    }

    public Card(String nome, String descricao, String categoria, String status, int prioridade) {
        this.nome = nome;
        this.descricao = descricao;
        this.categoria = categoria;
        this.status = status;
        this.prioridade = prioridade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public Date getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(Date dataTermino) {
        this.dataTermino = dataTermino;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setarStatus(BufferedReader leitura) throws IOException {
        System.out.println("Digite a opção desejada de status: " +
                "\n1. A Fazer" +
                "\n2. Em Progresso" +
                "\n3. Feito");
        int a = Integer.parseInt(leitura.readLine());
        if(a == 1){
            this.setStatus("A Fazer");
        }
        else if(a == 2){
            this.setStatus("Em Progresso");
        }
        else if(a == 3){
            this.setStatus("Feito");
        }
    }

    @Override
    public String toString() {
        return "Card{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", categoria='" + categoria + '\'' +
                ", status='" + status + '\'' +
                ", prioridade=" + prioridade +
                ", dataTermino=" + dataTermino +
                '}';
    }

    public int compareTo(Card o) {
        if(prioridade > o.prioridade){
            return 1;
        }
        else if(prioridade < o.prioridade){
            return -1;
        }
        else{
            return 0;
        }
    }
}
