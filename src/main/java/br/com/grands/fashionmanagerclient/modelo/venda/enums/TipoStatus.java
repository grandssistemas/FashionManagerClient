package br.com.grands.fashionmanagerclient.modelo.venda.enums;

/**
 * Created by rafael on 10/03/17.
 */
public enum TipoStatus {
    SALVA("OPEN"),FINALIZADA("FINISH"),CANCELADA("CANCELLED");

    private String type;

    TipoStatus(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public static TipoStatus getByType(String type) {
        for(TipoStatus s: TipoStatus.values()){
            if(s.getType().equals(type)){
                return s;
            }
        }
        return null;
    }
}
