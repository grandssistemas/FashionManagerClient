package br.com.grands.fashionmanagerclient.modelo.venda;

import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

/**
 * Created by rafael on 10/03/17.
 */
public class ItemVenda {
    @ApiModelProperty(value = "Codigo do produto.", position = 1)
    public Long codProduto;
    @ApiModelProperty(value = "Quantidade vendida.", position = 2)
    public BigDecimal qntdVendida;
    @ApiModelProperty(value = "Valor bruto vendido, dado por (valor sem desconto * quantidade vendida).", position = 3)
    public BigDecimal valorBruto;
    @ApiModelProperty(value = "Origem da mercadoria(SEFAZ).", position = 4)
    public Integer orig;
    @ApiModelProperty(value = "Codigo de barras do produto vendido.", position = 5)
    public String barras;
    @ApiModelProperty(value = "Valor do desconto aplicado no item (UN).", position = 6)
    public BigDecimal desconto;
    @ApiModelProperty(value = "Valor liquido do produto obtido com : (valor liquido unitario * quantidade vendida).", position = 7)
    public BigDecimal valorLiquido;
    @ApiModelProperty(value = "Identificador Bico.", position = 8)
    public String idBico;
    @ApiModelProperty(value = "Numero do tanque.", position = 9)
    public String numTanque;
    @ApiModelProperty(value = "Numero da bomba.", position = 10)
    public String numBomba;
    @ApiModelProperty(value = "Numero do bico da bomba.", position = 11)
    public String numBicoBomba;
    @ApiModelProperty(value = "Encerrante inicial.", position = 12)
    public String encerranteInicial;
    @ApiModelProperty(value = "Encerrante final.", position = 13)
    public String encerranteFinal;

    @ApiModelProperty(value = "Valor da aliquota do ICMS.", position = 14)
    public String pICMS;
    @ApiModelProperty(value = "Valor calculado do ICMS, (Valor geral do ICMS * quantidade vendida).", position = 15)
    public String vICMS;
    @ApiModelProperty(value = "Codigo da situação tributária do ICMS (SEFAZ).", position = 16)
    public String cstICMS;

    @ApiModelProperty(value = "CFOP (SEFAZ).", position = 17)
    public String cfop;


    @ApiModelProperty(value = "Valor da aliquota do PIS.", position = 18)
    public String pPIS;
    @ApiModelProperty(value = "Valor calculado do PIS, (Valor geral do PIS * quantidade vendida).", position = 19)
    public String vPIS;
    @ApiModelProperty(value = "Codigo da situação tributária do PIS (SEFAZ).", position = 20)
    public String cstPIS;

    @ApiModelProperty(value = "Valor da aliquota do COFINS.", position = 21)
    public String pCOFINS;
    @ApiModelProperty(value = "Valor calculado do COFINS, (Valor geral do COFINS * quantidade vendida).", position = 22)
    public String vCOFINS;
    @ApiModelProperty(value = "Codigo da situação tributária do COFINS (SEFAZ).", position = 23)
    public String cstCOFINS;

    @ApiModelProperty(value = "Valor da aliquota do IPI.", position = 24)
    public String pIPI;
    @ApiModelProperty(value = "Valor calculado do IPI, (Valor geral do IPI * quantidade vendida).", position = 25)
    public String vIPI;
    @ApiModelProperty(value = "Codigo da situação tributária do IPI (SEFAZ).", position = 26)
    public String cstIPI;
    @ApiModelProperty(value = "Codigo de enquadramento do IPI (SEFAZ).", position = 27)
    public String cEnq;

    @ApiModelProperty(value = "Valor da base de calculo do ICMS.", position = 28)
    public String vBCICMS;
    @ApiModelProperty(value = "Valor da base de calculo do PIS.", position = 29)
    public String vBCPIS;
    @ApiModelProperty(value = "Valor da base de calculo do COFINS.", position = 30)
    public String vBCCOFINS;
    @ApiModelProperty(value = "Valor da base de calculo do IPI.", position = 31)
    public String vBCIPI;

    @ApiModelProperty(value = "Valor unitário do item.", position = 31)
    public BigDecimal valorUnitario;

    
}
