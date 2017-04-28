package br.com.grands.fashionmanagerclient.modelo.tributador.enums;

/**
 * Created by luizaugusto on 20/04/17.
 */
public enum CalculationType {
    UNIDADE,PORCENTAGEM;

    public static CalculationType findByName(String name) {
        for (CalculationType s : CalculationType.values()) {
            if (name.equalsIgnoreCase(s.name()))
                return s;
        }
        return null;
    }
}
