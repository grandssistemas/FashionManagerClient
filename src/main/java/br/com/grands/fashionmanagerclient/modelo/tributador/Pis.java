package br.com.grands.fashionmanagerclient.modelo.tributador;

import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

/**
 * Created by gelatti on 03/11/16.
 */
public class Pis {

    @ApiModelProperty(value = "CST que esta relacionado ao grupo de tributação", position = 1, required = true)
    private String CST;
    @ApiModelProperty(value = "Nome da formula para o valor da base de calculo do PIS", position = 2)
    private String vBC;
    @ApiModelProperty(value = "Nome da formula para o valor do PIS", position = 3)
    private String vPIS;
    @ApiModelProperty(value = "Percentual do PIS", position = 4)
    private BigDecimal pPIS;
    @ApiModelProperty(value = "Nome da formula para o valor da base de calculo do PIS ST", position = 5)
    private String vBCST;
    @ApiModelProperty(value = "Nome da formula para o valor do PIS ST", position = 6)
    private String vPISST;
    @ApiModelProperty(value = "Percentual do PIS ST", position = 7)
    private BigDecimal pPISST;
    @ApiModelProperty(value = "Tipo de unidade para o calculo do PIS", position = 8)
    private String calculationType;
    @ApiModelProperty(value = "Tipo de unidade para o calculo do PIS ST", position = 9)
    private String calculationTypeST;
    @ApiModelProperty(value = "Mensagem que ira aparecer nas informações adicionais da nota", position = 10)
    private String mensagem;

    public String getCST() {
        return CST;
    }

    public void setCST(String CST) {
        this.CST = CST;
    }

    public String getvBC() {
        return vBC;
    }

    public void setvBC(String vBC) {
        this.vBC = vBC;
    }

    public String getvPIS() {
        return vPIS;
    }

    public void setvPIS(String vPIS) {
        this.vPIS = vPIS;
    }

    public BigDecimal getpPIS() {
        return pPIS;
    }

    public void setpPIS(BigDecimal pPIS) {
        this.pPIS = pPIS;
    }

    public String getvBCST() {
        return vBCST;
    }

    public void setvBCST(String vBCST) {
        this.vBCST = vBCST;
    }

    public String getvPISST() {
        return vPISST;
    }

    public void setvPISST(String vPISST) {
        this.vPISST = vPISST;
    }

    public BigDecimal getpPISST() {
        return pPISST;
    }

    public void setpPISST(BigDecimal pPISST) {
        this.pPISST = pPISST;
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
