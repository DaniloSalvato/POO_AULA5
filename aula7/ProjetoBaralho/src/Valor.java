import java.util.HashMap;
import java.util.Map;

public enum Valor {
        As("As"),
        Dois(2,"Dois"),
        Tres(3,"Tres"),
        Quatro(4,"Quatro"),
        Cinco(5,"Cinco"),
        Seis(6,"Seis"),
        Sete(7,"Sete"),
        Oito(8,"Oito"),
        Nove(9,"Nove"),
        Dez(10,"Dez"),
        Dama(11,"Dama"),
        Valete(12,"Valete"),
        Reis(13,"Rei");

        private static final Map<Long, Valor> byId = new HashMap<Long, Valor>();

        static {

        for (Valor valor : Valor.values()) {
                if (byId.put(valor.getId(), valor) != null) {
                        throw new IllegalArgumentException("duplicate id: " + valor.getId());
                        }
                }
        }

        public static Valor getById(Long id){
                return byId.get(id);
                }

        Valor(Long id, String name) {
                this.name = name;
                this.id = id;
        }

        public String getName() {
                return name;
        }

        public Long getId() {
                return id;
        }
}


