import java.util.Scanner;

public class TesteName {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Tabuleiro tabuleiro = new Tabuleiro();
        int[] p = new int[2];

        System.out.println("Digite o primeiro palpite: ");
        p[0]=Integer.parseInt(scan.nextLine());
        System.out.println("Digite o segundo palpite: ");
        p[1]=Integer.parseInt(scan.nextLine());
        tabuleiro.setPalpite(p);

        double premio = tabuleiro.jogar();

        if(premio > 0.0){
            System.out.println("Parabens! Você ganhou !");
            System.out.println("Premio: " + premio);
        }else {
            System.out.println("Infelizmente não ganhou");
        }
    }
}