package br.com.grands.fashionmanagerclient.modelo.vendanova.enums;


public enum StatusVenda {
    ABERTO("OPEN"),
    FINALIZADO("FINISH"),
    CANCELADO("CANCELLED"),
    ESTORNADO("REVERSED");

    private final String mobiageName;

    StatusVenda(String mobiageName) {
        this.mobiageName = mobiageName;
    }

    public String getMobiageName(){
        return this.mobiageName;
    }

    public String getName(){
        return this.name();
    }

    public static StatusVenda findByMobiageName(String name) {
        for (StatusVenda s : StatusVenda.values()) {
            if (name.equalsIgnoreCase(s.getMobiageName()))
                return s;
        }
        return null;
    }

    public static StatusVenda findByName(String name) {
        for (StatusVenda s : StatusVenda.values()) {
            if (name.equalsIgnoreCase(s.getName()))
                return s;
        }
        return null;
    }

}
