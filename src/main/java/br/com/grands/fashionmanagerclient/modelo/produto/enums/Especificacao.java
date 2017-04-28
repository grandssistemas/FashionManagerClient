package br.com.grands.fashionmanagerclient.modelo.produto.enums;

/**
 * Created by luizaugusto on 25/04/17.
 */
public enum Especificacao {
    COMBUSTIVEL("GAS")
//    ,ARMAMENTO("WEAPON")
//    ,MEDICAMENTO("MEDICINE")
//    ,AUTOMOVEIS("CAR")
    ;

    private String label;

    Especificacao(String label) {
        this.label = label;
    }

    public String getLabel() {
        return this.label;
    }

    public static Especificacao findByLabel(String name) {
        for (Especificacao s : Especificacao.values()) {
            if (name.equalsIgnoreCase(s.label))
                return s;
        }
        return null;
    }
}
