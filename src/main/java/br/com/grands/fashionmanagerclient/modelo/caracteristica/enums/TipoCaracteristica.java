package br.com.grands.fashionmanagerclient.modelo.caracteristica.enums;

public enum TipoCaracteristica {
    TEXTO,
    NUMERICO,
    LOGICO,
    COR,
    TAMANHO,
    SELECAO,
    MULTISELECAO,
    DATA;

    public String getName(){
        return this.name();
    }

    public static TipoCaracteristica findByName(String name) {
        for (TipoCaracteristica s : TipoCaracteristica.values()) {
            if (name.equalsIgnoreCase(s.getName()))
                return s;
        }
        return null;
    }
}
