public class GerenciarJogo {
    public static void main(String[] args) {
        Baralho meuBaralho = new Baralho();
        System.out.println(meuBaralho.listarCartas());
        meuBaralho.embaralhar();
        System.out.println();
        System.out.println(meuBaralho.listarCartas());
    }
}