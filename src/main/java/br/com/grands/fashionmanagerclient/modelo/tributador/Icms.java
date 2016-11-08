package br.com.grands.fashionmanagerclient.modelo.tributador;

import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

/**
 * Created by gelatti on 03/11/16.
 */
public class Icms {

    @ApiModelProperty(value = "CFOP que esta relacionado ao grupo de tributação", position = 1, required = true)
    private String cfop;
    @ApiModelProperty(value = "CST que esta relacionado ao grupo de tributação", position = 2)
    private String CST;
    @ApiModelProperty(value = "Modalidade de determinação da BC do ICMS", position = 3)
    private String modBC;
    @ApiModelProperty(value = "Modalidade de determinação da BC do ICMS ST", position = 4)
    private String modBCST;
    @ApiModelProperty(value = "Nome da formula para o valor da base de calculo do ICMS", position = 5)
    private String vBC;
    @ApiModelProperty(value = "Nome da formula para o valor da base de calculo do ICMS ST", position = 6)
    private String vBCST;
    @ApiModelProperty(value = "Percentual do ICMS", position = 7)
    private BigDecimal pICMS;
    @ApiModelProperty(value = "Percentual do ICMS ST", position = 8)
    private BigDecimal pICMSST;
    @ApiModelProperty(value = "Nome da formula para o valor do ICMS", position = 9)
    private String vICMS;
    @ApiModelProperty(value = "Nome da formula para o valor da base de calculo do ICMS ST retido", position = 10)
    private String vBCSTRet;
    @ApiModelProperty(value = "Nome da formula para o valor do ICMS ST retido", position = 11)
    private String vICMSSTRet;
    @ApiModelProperty(value = "Nome da formula para o valor da base de calculo do ICMS ST da UF destino", position = 12)
    private String vBCSTDest;
    @ApiModelProperty(value = "Nome da formula para o valor do ICMS ST", position = 13)
    private String vICMSST;
    @ApiModelProperty(value = "Percentual da margem de valor Adicionado do ICMS ST", position = 14)
    private BigDecimal pMVAST;
    @ApiModelProperty(value = "Percentual da redução de base de calculo do ICMS", position = 15)
    private BigDecimal pRedBC;
    @ApiModelProperty(value = "Percentual da redução de base de calculo do ICMS ST", position = 16)
    private BigDecimal pRedBCST;
    @ApiModelProperty(value = "Percentual da base de calculo operação própria", position = 17)
    private BigDecimal pBCOp;
    @ApiModelProperty(value = "Motivo da desoneração do ICMS", position = 18)
    private String motDesICMS;
    @ApiModelProperty(value = "Nome da formula para o valor do ICMS ST da UF destino", position = 19)
    private String vICMSSTDest;
    @ApiModelProperty(value = "Nome da formula para o valor do ICMS da operação", position = 20)
    private String vICMSOp;
    @ApiModelProperty(value = "Percentual do diferimento", position = 21)
    private BigDecimal pDif;
    @ApiModelProperty(value = "Nome da formula para o valor do ICMS diferido", position = 22)
    private String vICMSDif;
    @ApiModelProperty(value = "Nome da formula para o valor do ICMS desonerado", position = 23)
    private String vICMSDeson;
    @ApiModelProperty(value = "Mensagem que ira aparecer nas informações adicionais da nota", position = 24)
    private String mensagem;
    @ApiModelProperty(value = "UF para qual é devido o ICMS ST", position = 25)
    private String UFST;
    @ApiModelProperty(value = "Percentual de redução do ICMS ST proprio", position = 26)
    private BigDecimal pRedIMCSSTProp;
    @ApiModelProperty(value = "CSOSN que esta relacionado ao grupo de tributação", position = 27)
    private String CSOSN;
    @ApiModelProperty(value = "Alíquota aplicável de cálculo do crédito (Simples Nacional)", position = 28)
    private BigDecimal pCredSN;
    @ApiModelProperty(value = "Nome da formula para o valor crédito do ICMS (Simples Nacional)", position = 29)
    private String vCredICMSSN;
    @ApiModelProperty(value = "Percentual do fundo de combate a pobreza da UF destino", position = 30)
    private BigDecimal pFCPUFDest;
    @ApiModelProperty(value = "Percentual do ICMS da UF destino", position = 31)
    private BigDecimal pICMSUFDest;

    public String getCfop() {
        return cfop;
    }

    public void setCfop(String cfop) {
        this.cfop = cfop;
    }

    public String getCST() {
        return CST;
    }

    public void setCST(String CST) {
        this.CST = CST;
    }

    public String getModBC() {
        return modBC;
    }

    public void setModBC(String modBC) {
        this.modBC = modBC;
    }

    public String getModBCST() {
        return modBCST;
    }

    public void setModBCST(String modBCST) {
        this.modBCST = modBCST;
    }

    public String getvBC() {
        return vBC;
    }

    public void setvBC(String vBC) {
        this.vBC = vBC;
    }

    public String getvBCST() {
        return vBCST;
    }

    public void setvBCST(String vBCST) {
        this.vBCST = vBCST;
    }

    public BigDecimal getpICMS() {
        return pICMS;
    }

    public void setpICMS(BigDecimal pICMS) {
        this.pICMS = pICMS;
    }

    public BigDecimal getpICMSST() {
        return pICMSST;
    }

    public void setpICMSST(BigDecimal pICMSST) {
        this.pICMSST = pICMSST;
    }

    public String getvICMS() {
        return vICMS;
    }

    public void setvICMS(String vICMS) {
        this.vICMS = vICMS;
    }

    public String getvBCSTRet() {
        return vBCSTRet;
    }

    public void setvBCSTRet(String vBCSTRet) {
        this.vBCSTRet = vBCSTRet;
    }

    public String getvICMSSTRet() {
        return vICMSSTRet;
    }

    public void setvICMSSTRet(String vICMSSTRet) {
        this.vICMSSTRet = vICMSSTRet;
    }

    public String getvBCSTDest() {
        return vBCSTDest;
    }

    public void setvBCSTDest(String vBCSTDest) {
        this.vBCSTDest = vBCSTDest;
    }

    public String getvICMSST() {
        return vICMSST;
    }

    public void setvICMSST(String vICMSST) {
        this.vICMSST = vICMSST;
    }

    public BigDecimal getpMVAST() {
        return pMVAST;
    }

    public void setpMVAST(BigDecimal pMVAST) {
        this.pMVAST = pMVAST;
    }

    public BigDecimal getpRedBC() {
        return pRedBC;
    }

    public void setpRedBC(BigDecimal pRedBC) {
        this.pRedBC = pRedBC;
    }

    public BigDecimal getpRedBCST() {
        return pRedBCST;
    }

    public void setpRedBCST(BigDecimal pRedBCST) {
        this.pRedBCST = pRedBCST;
    }

    public BigDecimal getpBCOp() {
        return pBCOp;
    }

    public void setpBCOp(BigDecimal pBCOp) {
        this.pBCOp = pBCOp;
    }

    public String getMotDesICMS() {
        return motDesICMS;
    }

    public void setMotDesICMS(String motDesICMS) {
        this.motDesICMS = motDesICMS;
    }

    public String getvICMSSTDest() {
        return vICMSSTDest;
    }

    public void setvICMSSTDest(String vICMSSTDest) {
        this.vICMSSTDest = vICMSSTDest;
    }

    public String getvICMSOp() {
        return vICMSOp;
    }

    public void setvICMSOp(String vICMSOp) {
        this.vICMSOp = vICMSOp;
    }

    public BigDecimal getpDif() {
        return pDif;
    }

    public void setpDif(BigDecimal pDif) {
        this.pDif = pDif;
    }

    public String getvICMSDif() {
        return vICMSDif;
    }

    public void setvICMSDif(String vICMSDif) {
        this.vICMSDif = vICMSDif;
    }

    public String getvICMSDeson() {
        return vICMSDeson;
    }

    public void setvICMSDeson(String vICMSDeson) {
        this.vICMSDeson = vICMSDeson;
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getUFST() {
        return UFST;
    }

    public void setUFST(String UFST) {
        this.UFST = UFST;
    }

    public BigDecimal getpRedIMCSSTProp() {
        return pRedIMCSSTProp;
    }

    public void setpRedIMCSSTProp(BigDecimal pRedIMCSSTProp) {
        this.pRedIMCSSTProp = pRedIMCSSTProp;
    }

    public String getCSOSN() {
        return CSOSN;
    }

    public void setCSOSN(String CSOSN) {
        this.CSOSN = CSOSN;
    }

    public BigDecimal getpCredSN() {
        return pCredSN;
    }

    public void setpCredSN(BigDecimal pCredSN) {
        this.pCredSN = pCredSN;
    }

    public String getvCredICMSSN() {
        return vCredICMSSN;
    }

    public void setvCredICMSSN(String vCredICMSSN) {
        this.vCredICMSSN = vCredICMSSN;
    }

    public BigDecimal getpFCPUFDest() {
        return pFCPUFDest;
    }

    public void setpFCPUFDest(BigDecimal pFCPUFDest) {
        this.pFCPUFDest = pFCPUFDest;
    }

    public BigDecimal getpICMSUFDest() {
        return pICMSUFDest;
    }

    public void setpICMSUFDest(BigDecimal pICMSUFDest) {
        this.pICMSUFDest = pICMSUFDest;
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
