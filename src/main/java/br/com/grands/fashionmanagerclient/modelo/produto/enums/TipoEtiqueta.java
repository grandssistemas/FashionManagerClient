package br.com.grands.fashionmanagerclient.modelo.produto.enums;


/**
 * Created by luizaugusto on 19/04/17.
 */
public enum TipoEtiqueta {
    UNIDADE("COMMON"), BALANCA_UNITARIO("BALANCE_UNIT"), BALANCA_PESO("BALANCE_WEIGHT");

    public String typeLabeling;

    TipoEtiqueta(String typeLabeling) {
        this.typeLabeling = typeLabeling;
    }

    public static TipoEtiqueta findByName(String name) {
        for (TipoEtiqueta s : TipoEtiqueta.values()) {
            if (name.equalsIgnoreCase(s.typeLabeling))
                return s;
        }
        return null;
    }
}
