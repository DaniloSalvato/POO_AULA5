package constants;

import java.util.HashMap;
import java.util.Map;

public enum Naipe {
    Ouro(1), Espada(2), Copas(3), Paus(4);

    private static final Map<Integer, Naipe> valorNaipe = new HashMap<Integer, Naipe>();

    static {

        for (Naipe valorNaipe : Naipe.values()) {
            if (Naipe.valorNaipe.put(valorNaipe.getId(), valorNaipe) != null) {
                throw new IllegalArgumentException("duplicate id: " + valorNaipe.getId());
            }
        }
    }

    private final int id;

    public static Naipe getById(int id){
        return valorNaipe.get(id);
    }

    Naipe(int valorNaipe) {
        this.id =  valorNaipe;
    }

    public int getId() {
        return id;
    }
}
