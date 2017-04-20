package br.com.grands.fashionmanagerclient.modelo.caracteristica.enums;

/**
 * Created by luizaugusto on 20/04/17.
 */
public enum OrigemCaracteristica {
    PRODUTO("PRODUCT"),
    PESSOA("PERSON"),
    OPERACAO("OPERATION"),
    PAGAMENTO("PAYMENT");

    private final String mobiageName;


    OrigemCaracteristica(String mobiageName) {
        this.mobiageName = mobiageName;
    }

    public String getMobiageName(){
        return this.mobiageName;
    }

    public String getName(){
        return this.name();
    }

    public static OrigemCaracteristica findByMobiageName(String name) {
        for (OrigemCaracteristica s : OrigemCaracteristica.values()) {
            if (name.equalsIgnoreCase(s.getMobiageName()))
                return s;
        }
        return null;
    }



}
