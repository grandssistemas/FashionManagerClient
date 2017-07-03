package br.com.grands.fashionmanagerclient.modelo.vendanova.enums;

/**
 * Created by luizaugusto on 26/06/17.
 */
public enum TipoPagamento {
    ENTRADA("ENTRY"),
    PARCELA("PARCEL");

    private final String mobiageName;

    TipoPagamento(String mobiageName) {
        this.mobiageName = mobiageName;
    }

    public String getMobiageName() {
        return this.mobiageName;
    }

    public String getName() {
        return this.name();
    }

    public static TipoPagamento findByMobiageName(String name) {
        for (TipoPagamento s : TipoPagamento.values()) {
            if (name.equalsIgnoreCase(s.getMobiageName()))
                return s;
        }
        return null;
    }

    public static TipoPagamento findByName(String name) {
        for (TipoPagamento s : TipoPagamento.values()) {
            if (name.equalsIgnoreCase(s.getName()))
                return s;
        }
        return null;
    }
}
