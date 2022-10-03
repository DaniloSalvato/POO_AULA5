import model.Baralho;
import model.Carta;
import model.Jogador;

import java.util.*;


import static model.Baralho.distrubuir;

public class GerenciarJogo {
    static int auxPontuacaoRodadaJ1 = 0;
    static int auxPontuacaoRodadaJ2 = 0;
    static int auxPontuacaoTotalJ1 = 0;
    static int auxPontuacaoTotalJ2 = 0;
    static int pontuacaoRodada = 0;
    static int pontuacaoTotal =0;

    public static void main(String[] args) {
        List<Jogador> jogadores = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int opc = 0;

        System.out.println("            BEM VINDO A HORA DO TRUCO!              ");
        System.out.println("  Antes de começarmos digite o nome dos jogadores ");
        System.out.println("");
        while(opc < 2) {
            System.out.println("Nome do Jogador: ");
            jogadores.add(new Jogador(scan.nextLine()));
            System.out.println(jogadores.get(opc).toString());
            opc++;
        }

        while(pontuacaoTotal <= 12) {
            int rodada = 0;
            Baralho baralho = new Baralho();
            baralho.embaralhar();
            distrubuir(jogadores, baralho);
            System.out.println("");
            System.out.println("Embaralhando...");
            System.out.println("");
            baralho.definirVira(baralho);
            baralho.mostrarVira();
            System.out.println("");

            do {
                System.out.println("jogador 1");
                jogadores.get(0).verMao();
                System.out.println("jogador 2");
                jogadores.get(1).verMao();
                System.out.println("");
                rodada++;
                if (auxPontuacaoRodadaJ1 != 3 || auxPontuacaoRodadaJ2 != 3) {
                    System.out.println("Jogador 1 escolha sua carta:");
                    jogadores.get(0).escolherCarta(scan, 0, jogadores);
                    System.out.println("");

                    System.out.println("Jogador 2 escolha sua carta");
                    jogadores.get(1).escolherCarta(scan, 1, jogadores);
                    System.out.println("");

                    compararCarta(jogadores);

                    jogadores.get(0).getCartasJogador().remove(jogadores.get(0).getEscolha());
                    jogadores.get(1).getCartasJogador().remove(jogadores.get(1).getEscolha());

                    System.out.println("--------------------------------------------------------------");

                    if (auxPontuacaoRodadaJ1 == 2 ) {
                        System.out.println("Jogador 1 ganhou a rodada" );
                        auxPontuacaoTotalJ1++;
                        break;
                    }

                    if (auxPontuacaoRodadaJ2 == 2 ) {
                        System.out.println("Jogador 2 ganhou a rodada" );
                        auxPontuacaoTotalJ2++;
                        break;
                    }
                    if (auxPontuacaoRodadaJ1 == 3 ) {
                        System.out.println("Jogador 1 ganhou a rodada" );
                        auxPontuacaoTotalJ1++;
                        break;
                    }
                    if (auxPontuacaoRodadaJ2 == 3 ) {
                        System.out.println("Jogador 2 ganhou a rodada" );
                        auxPontuacaoTotalJ2++;
                        break;
                    }
                }
            } while (pontuacaoRodada <= 3);
        }
    }

    private static void compararCarta(List<Jogador> jogadores) {

        if(jogadores.get(0).getEscolha().getValor().ordinal() > jogadores.get(1).getEscolha().getValor().ordinal()){
            System.out.println("Jogador 1 ganhou ");
            System.out.println("");
            auxPontuacaoRodadaJ1++;
        }else{
            if(jogadores.get(0).getEscolha().getValor().ordinal() < jogadores.get(1).getEscolha().getValor().ordinal()) {
                System.out.println("Jogador 2 ganhou ");
                System.out.println("");
                auxPontuacaoRodadaJ2++;
            }else{
                if(jogadores.get(0).getEscolha().getNaipe().ordinal() > jogadores.get(1).getEscolha().getNaipe().ordinal()){
                    System.out.println("Jogador 1 ganhou ");
                    System.out.println("");
                    auxPontuacaoRodadaJ1++;
                }else{
                    System.out.println("Jogador 2 ganhou ");
                    System.out.println("");
                    auxPontuacaoRodadaJ2++;
                    }
                }
            }
        }
    }
