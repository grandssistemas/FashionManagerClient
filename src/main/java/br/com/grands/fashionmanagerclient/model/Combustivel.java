package br.com.grands.fashionmanagerclient.model;

import java.math.BigDecimal;

/**
 * Created by gumga on 17/10/16.
 */
public class Combustivel {

    private Long id;
    private String codigoANP;
    private BigDecimal percentualGasNatural;
    private String codif;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigoANP() {
        return codigoANP;
    }

    public void setCodigoANP(String codigoANP) {
        this.codigoANP = codigoANP;
    }

    public BigDecimal getPercentualGasNatural() {
        return percentualGasNatural;
    }

    public void setPercentualGasNatural(BigDecimal percentualGasNatural) {
        this.percentualGasNatural = percentualGasNatural;
    }

    public String getCodif() {
        return codif;
    }

    public void setCodif(String codif) {
        this.codif = codif;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
