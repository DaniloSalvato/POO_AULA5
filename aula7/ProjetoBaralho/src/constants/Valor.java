package constants;

import java.util.HashMap;
import java.util.Map;

public enum Valor {
        Quatro(4),
        Cinco(5),
        Seis(6),
        Sete(7),
        Dama(8),
        Valete(9),
        Reis(10),
        As(11),
        Dois(12),
        Tres(13);

        private static final Map<Integer, Valor> valorCarta = new HashMap<Integer, Valor>();

        static {

        for (Valor valor : Valor.values()) {
                if (valorCarta.put(valor.getValor(), valor) != null) {
                        throw new IllegalArgumentException("duplicate id: " + valor.getValor());
                        }
                }
        }

        private final int valor;

        public static Valor getById(int id){
                return valorCarta.get(id);
                }

        Valor(int valorCarta) {
                this.valor = valorCarta;
        }

        public int getValor() {
                return valor;
        }
}


