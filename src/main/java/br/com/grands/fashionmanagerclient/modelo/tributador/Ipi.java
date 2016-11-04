package br.com.grands.fashionmanagerclient.modelo.tributador;

import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

/**
 * Created by gelatti on 03/11/16.
 */
public class Ipi {

    @ApiModelProperty(value = "CST que esta relacionado ao grupo de tributação", position = 1)
    private String CST;
    @ApiModelProperty(value = "Tipo de unidade para o calculo do IPI", position = 2)
    private String ipiCalculationType;
    @ApiModelProperty(value = "Nome da formula para o valor do IPI", position = 3)
    private String vIPI;
    @ApiModelProperty(value = "Nome da formula para o valor da base de calculo do IPI", position = 4)
    private String vBC;
    @ApiModelProperty(value = "Percentual do IPI", position = 5)
    private BigDecimal pIPI;
    @ApiModelProperty(value = "Mensagem que ira aparecer nas informações adicionais da nota", position = 6)
    private String mensagem;

    public String getCST() {
        return CST;
    }

    public void setCST(String CST) {
        this.CST = CST;
    }

    public String getIpiCalculationType() {
        return ipiCalculationType;
    }

    public void setIpiCalculationType(String ipiCalculationType) {
        this.ipiCalculationType = ipiCalculationType;
    }

    public String getvIPI() {
        return vIPI;
    }

    public void setvIPI(String vIPI) {
        this.vIPI = vIPI;
    }

    public String getvBC() {
        return vBC;
    }

    public void setvBC(String vBC) {
        this.vBC = vBC;
    }

    public BigDecimal getpIPI() {
        return pIPI;
    }

    public void setpIPI(BigDecimal pIPI) {
        this.pIPI = pIPI;
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
