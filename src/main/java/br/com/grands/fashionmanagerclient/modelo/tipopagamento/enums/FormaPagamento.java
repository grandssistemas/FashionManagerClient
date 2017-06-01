package br.com.grands.fashionmanagerclient.modelo.tipopagamento.enums;

public enum FormaPagamento {
    ESPECIE,BANCARIO,OUTROS;

    public static FormaPagamento findByName(String name) {
        for (FormaPagamento s : FormaPagamento.values()) {
            if (name.equalsIgnoreCase(s.name()))
                return s;
        }
        return null;
    }
}
