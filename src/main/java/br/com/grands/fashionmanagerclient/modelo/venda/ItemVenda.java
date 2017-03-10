package br.com.grands.fashionmanagerclient.modelo.venda;

import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

/**
 * Created by rafael on 10/03/17.
 */
public class ItemVenda {
    @ApiModelProperty(value = "Codigo do produto.", position = 1)
    private Long codProduto;
    @ApiModelProperty(value = "Quantidade vendida.", position = 2)
    private BigDecimal qntdVendida;
    @ApiModelProperty(value = "Valor bruto vendido, dado por (valor sem desconto * quantidade vendida).", position = 3)
    private BigDecimal valorBruto;
    @ApiModelProperty(value = "Origem da mercadoria(SEFAZ).", position = 4)
    private Integer orig;
    @ApiModelProperty(value = "Codigo de barras do produto vendido.", position = 5)
    private String barras;
    @ApiModelProperty(value = "Valor do desconto aplicado no item (UN).", position = 6)
    private String desconto;
    @ApiModelProperty(value = "Valor liquido do produto obtido com : (valor liquido unitario * quantidade vendida).", position = 7)
    private BigDecimal valorLiquido;
    @ApiModelProperty(value = "Identificador Bico.", position = 8)
    private Long idBico;
    @ApiModelProperty(value = "Numero do tanque.", position = 9)
    private Long numTanque;
    @ApiModelProperty(value = "Numero da bomba.", position = 10)
    private Long numBomba;
    @ApiModelProperty(value = "Numero do bico da bomba.", position = 11)
    private Long numBicoBomba;
    @ApiModelProperty(value = "Encerrante inicial.", position = 12)
    private Long encerranteInicial;
    @ApiModelProperty(value = "Encerrante final.", position = 13)
    private Long encerranteFinal;

    @ApiModelProperty(value = "Valor da aliquota do ICMS.", position = 14)
    private String pICMS;
    @ApiModelProperty(value = "Valor calculado do ICMS, (Valor geral do ICMS * quantidade vendida).", position = 15)
    private String vICMS;
    @ApiModelProperty(value = "Codigo da situação tributária do ICMS (SEFAZ).", position = 16)
    private String cstICMS;

    @ApiModelProperty(value = "CFOP (SEFAZ).", position = 17)
    private String cfop;


    @ApiModelProperty(value = "Valor da aliquota do PIS.", position = 18)
    private String pPIS;
    @ApiModelProperty(value = "Valor calculado do PIS, (Valor geral do PIS * quantidade vendida).", position = 19)
    private String vPIS;
    @ApiModelProperty(value = "Codigo da situação tributária do PIS (SEFAZ).", position = 20)
    private String cstPIS;

    @ApiModelProperty(value = "Valor da aliquota do COFINS.", position = 21)
    private String pCOFINS;
    @ApiModelProperty(value = "Valor calculado do COFINS, (Valor geral do COFINS * quantidade vendida).", position = 22)
    private String vCOFINS;
    @ApiModelProperty(value = "Codigo da situação tributária do COFINS (SEFAZ).", position = 23)
    private String cstCOFINS;

    @ApiModelProperty(value = "Valor da aliquota do IPI.", position = 24)
    private String pIPI;
    @ApiModelProperty(value = "Valor calculado do IPI, (Valor geral do IPI * quantidade vendida).", position = 25)
    private String vIPI;
    @ApiModelProperty(value = "Codigo da situação tributária do IPI (SEFAZ).", position = 26)
    private String cstIPI;
    @ApiModelProperty(value = "Codigo de enquadramento do IPI (SEFAZ).", position = 27)
    private String cEnq;

    public Long getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(Long codProduto) {
        this.codProduto = codProduto;
    }

    public BigDecimal getQntdVendida() {
        return qntdVendida;
    }

    public void setQntdVendida(BigDecimal qntdVendida) {
        this.qntdVendida = qntdVendida;
    }

    public BigDecimal getValorBruto() {
        return valorBruto;
    }

    public void setValorBruto(BigDecimal valorBruto) {
        this.valorBruto = valorBruto;
    }

    public Integer getOrig() {
        return orig;
    }

    public void setOrig(Integer orig) {
        this.orig = orig;
    }

    public String getBarras() {
        return barras;
    }

    public void setBarras(String barras) {
        this.barras = barras;
    }

    public String getDesconto() {
        return desconto;
    }

    public void setDesconto(String desconto) {
        this.desconto = desconto;
    }

    public BigDecimal getValorLiquido() {
        return valorLiquido;
    }

    public void setValorLiquido(BigDecimal valorLiquido) {
        this.valorLiquido = valorLiquido;
    }

    public Long getIdBico() {
        return idBico;
    }

    public void setIdBico(Long idBico) {
        this.idBico = idBico;
    }

    public Long getNumTanque() {
        return numTanque;
    }

    public void setNumTanque(Long numTanque) {
        this.numTanque = numTanque;
    }

    public Long getNumBomba() {
        return numBomba;
    }

    public void setNumBomba(Long numBomba) {
        this.numBomba = numBomba;
    }

    public Long getNumBicoBomba() {
        return numBicoBomba;
    }

    public void setNumBicoBomba(Long numBicoBomba) {
        this.numBicoBomba = numBicoBomba;
    }

    public Long getEncerranteInicial() {
        return encerranteInicial;
    }

    public void setEncerranteInicial(Long encerranteInicial) {
        this.encerranteInicial = encerranteInicial;
    }

    public Long getEncerranteFinal() {
        return encerranteFinal;
    }

    public void setEncerranteFinal(Long encerranteFinal) {
        this.encerranteFinal = encerranteFinal;
    }

    public String getpICMS() {
        return pICMS;
    }

    public void setpICMS(String pICMS) {
        this.pICMS = pICMS;
    }

    public String getvICMS() {
        return vICMS;
    }

    public void setvICMS(String vICMS) {
        this.vICMS = vICMS;
    }

    public String getCstICMS() {
        return cstICMS;
    }

    public void setCstICMS(String cstICMS) {
        this.cstICMS = cstICMS;
    }

    public String getCfop() {
        return cfop;
    }

    public void setCfop(String cfop) {
        this.cfop = cfop;
    }

    public String getpPIS() {
        return pPIS;
    }

    public void setpPIS(String pPIS) {
        this.pPIS = pPIS;
    }

    public String getvPIS() {
        return vPIS;
    }

    public void setvPIS(String vPIS) {
        this.vPIS = vPIS;
    }

    public String getCstPIS() {
        return cstPIS;
    }

    public void setCstPIS(String cstPIS) {
        this.cstPIS = cstPIS;
    }

    public String getpCOFINS() {
        return pCOFINS;
    }

    public void setpCOFINS(String pCOFINS) {
        this.pCOFINS = pCOFINS;
    }

    public String getvCOFINS() {
        return vCOFINS;
    }

    public void setvCOFINS(String vCOFINS) {
        this.vCOFINS = vCOFINS;
    }

    public String getCstCOFINS() {
        return cstCOFINS;
    }

    public void setCstCOFINS(String cstCOFINS) {
        this.cstCOFINS = cstCOFINS;
    }

    public String getpIPI() {
        return pIPI;
    }

    public void setpIPI(String pIPI) {
        this.pIPI = pIPI;
    }

    public String getvIPI() {
        return vIPI;
    }

    public void setvIPI(String vIPI) {
        this.vIPI = vIPI;
    }

    public String getCstIPI() {
        return cstIPI;
    }

    public void setCstIPI(String cstIPI) {
        this.cstIPI = cstIPI;
    }

    public String getcEnq() {
        return cEnq;
    }

    public void setcEnq(String cEnq) {
        this.cEnq = cEnq;
    }
}
