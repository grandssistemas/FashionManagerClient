package br.com.grands.fashionmanagerclient.modelo.tributador;

import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

/**
 * Created by gelatti on 03/11/16.
 */
public class Cofins {

    @ApiModelProperty(value = "Nome da formula para o valor da base de calculo do COFINS", position = 1)
    private String vBC;
    @ApiModelProperty(value = "Nome da formula para o valor do COFINS", position = 2)
    private String vCOFINS;
    @ApiModelProperty(value = "Nome da formula para o valor por unidade tributável", position = 3)
    private String vUnid;
    @ApiModelProperty(value = "Percentual do COFINS", position = 4)
    private BigDecimal pCOFINS;
    @ApiModelProperty(value = "Tipo de unidade para o calculo do COFINS", position = 5)
    private String calculationType;
    @ApiModelProperty(value = "Tipo de unidade para o calculo do COFINS ST", position = 6)
    private String calculationTypeST;
    @ApiModelProperty(value = "Nome da formula para o valor da base de calculo do COFINS ST", position = 7)
    private String vBCST;
    @ApiModelProperty(value = "Nome da formula para o valor do COFINS ST", position = 8)
    private String vCOFINSST;
    @ApiModelProperty(value = "Percentual do COFINS ST", position = 9)
    private BigDecimal pCOFINSST;
    @ApiModelProperty(value = "Mensagem que ira aparecer nas informações adicionais da nota", position = 10)
    private String mensagem;

    public String getvBC() {
        return vBC;
    }

    public void setvBC(String vBC) {
        this.vBC = vBC;
    }

    public String getvCOFINS() {
        return vCOFINS;
    }

    public void setvCOFINS(String vCOFINS) {
        this.vCOFINS = vCOFINS;
    }

    public String getvUnid() {
        return vUnid;
    }

    public void setvUnid(String vUnid) {
        this.vUnid = vUnid;
    }

    public BigDecimal getpCOFINS() {
        return pCOFINS;
    }

    public void setpCOFINS(BigDecimal pCOFINS) {
        this.pCOFINS = pCOFINS;
    }

    public String getCalculationType() {
        return calculationType;
    }

    public void setCalculationType(String calculationType) {
        this.calculationType = calculationType;
    }

    public String getCalculationTypeST() {
        return calculationTypeST;
    }

    public void setCalculationTypeST(String calculationTypeST) {
        this.calculationTypeST = calculationTypeST;
    }

    public String getvBCST() {
        return vBCST;
    }

    public void setvBCST(String vBCST) {
        this.vBCST = vBCST;
    }

    public String getvCOFINSST() {
        return vCOFINSST;
    }

    public void setvCOFINSST(String vCOFINSST) {
        this.vCOFINSST = vCOFINSST;
    }

    public BigDecimal getpCOFINSST() {
        return pCOFINSST;
    }

    public void setpCOFINSST(BigDecimal pCOFINSST) {
        this.pCOFINSST = pCOFINSST;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
