package br.com.grands.fashionmanagerclient.modelo.produto.enums;

public enum TipoBarras {
    GTIN("GTIN"), PROPRIO("OWN"), TERCEIRO("OTHERS");

    private String codeBarType;


    TipoBarras(String codeBarType) {
        this.codeBarType = codeBarType;
    }

    public String getType(){
        return this.codeBarType;
    }

    public static TipoBarras findByName(String name) {
        for (TipoBarras s : TipoBarras.values()) {
            if (name.equalsIgnoreCase(s.name()))
                return s;
        }
        return null;
    }
    public static TipoBarras findByLabel(String name) {
        for (TipoBarras s : TipoBarras.values()) {
            if (name.equalsIgnoreCase(s.codeBarType))
                return s;
        }
        return null;
    }
}
