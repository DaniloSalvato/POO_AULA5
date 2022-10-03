package model;

import constants.Valor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Jogador {
    private static int sequence;
    private Carta escolha;
    private int id;
    private String nome;
    private List<Carta> cartasJogador = new ArrayList<>();

    public Jogador() {}

    public Jogador(String nome) {
        sequence++;
        this.id = sequence;
        this.nome = nome;
        this.escolha = null;
    }

    public int getId(int i) {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Carta getEscolha() {
        return escolha;
    }

    public void setEscolha(Carta escolha) {
        this.escolha = escolha;
    }

    public List<Carta> getCartasJogador() {
        return cartasJogador;
    }

    @Override
    public String toString() {
        return "Id = " + id + "\n" +
               "Nome = " + nome + "\n";
    }

    public void verMao (){
        System.out.println(getCartasJogador());
    }

    public void escolherCarta(Scanner scan, int posicao, List<Jogador> jogadores) {

        System.out.println("Selecione sua carta (1, 2 ou 3):");
        int escolha = scan.nextInt();
        jogadores.get(posicao).setEscolha(getCartasJogador().get(escolha - 1));
        System.out.println("Carta escolhida: " + getCartasJogador().get(escolha - 1));
    }
}
