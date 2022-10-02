package model;

import constants.Naipe;
import constants.Valor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Baralho {

    private Carta vira;
    private List<Carta> cartas = new ArrayList<>();

    public Carta getVira() {
        return vira;
    }

    public void setVira(Carta vira) {
        this.vira = vira;
    }

    public List<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(List<Carta> cartas) {
        this.cartas = cartas;
    }

    public Baralho(){
           for (Valor valor : Valor.values()){
               for(Naipe naipe : Naipe.values()){
                   Carta carta = new Carta();
                   carta.setNaipe(naipe);
                   carta.setValor(valor);
                   cartas.add(carta);
               }
           }
       }

       public String listarCartas(){
           StringBuilder sb = new StringBuilder();
           for(Carta carta : cartas){
               sb.append(carta).append("\n");
           }
           return sb.toString();
       }

       //embaralhar
       public void embaralhar(){
           Collections.shuffle(cartas);
       }

        //distribuir
        public static void distrubuir(List<Jogador> jogadores, Baralho baralho) {
            for (Jogador jogador : jogadores) {
                jogador.getCartasJogador().addAll(baralho.getCartas().subList(0, 3));
                baralho.getCartas().removeAll(baralho.getCartas().subList(0, 3));
            }
        }

//    public static List<Carta> devolverCartas(int posicao, Carta cartas) {
//        return cartas.remove(posicao);
//
//    }

        //virar manilha
        public Carta virarManilha(Baralho baralho) {
            return vira = baralho.cartas.get(0);
        }

        public void mostrarManilha(){
            System.out.print("Vira : ");
            System.out.println(vira);
        }
}
