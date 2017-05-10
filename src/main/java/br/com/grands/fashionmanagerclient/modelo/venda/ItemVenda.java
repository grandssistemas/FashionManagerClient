package br.com.grands.fashionmanagerclient.modelo.venda;

import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

/**
 * Created by rafael on 10/03/17.
 */
public class ItemVenda {
    @ApiModelProperty(value = "Codigo do produto.", position = 1)
    public Long codproduto;
    @ApiModelProperty(value = "Quantidade vendida.", position = 2)
    public BigDecimal qntdvendida;
    @ApiModelProperty(value = "Valor bruto vendido, dado por (valor sem desconto * quantidade vendida).", position = 3)
    public BigDecimal valorbruto;
    @ApiModelProperty(value = "Origem da mercadoria(SEFAZ).", position = 4)
    public Integer orig;
    @ApiModelProperty(value = "Codigo de barras do produto vendido.", position = 5)
    public String barras;
    @ApiModelProperty(value = "Valor do desconto aplicado no item (UN).", position = 6)
    public BigDecimal desconto;
    @ApiModelProperty(value = "Valor liquido do produto obtido com : (valor liquido unitario * quantidade vendida).", position = 7)
    public BigDecimal valorliquido;
    @ApiModelProperty(value = "Identificador Bico.", position = 8)
    public String idbico;
    @ApiModelProperty(value = "Numero do tanque.", position = 9)
    public String numtanque;
    @ApiModelProperty(value = "Numero da bomba.", position = 10)
    public String numbomba;
    @ApiModelProperty(value = "Numero do bico da bomba.", position = 11)
    public String numbicobomba;
    @ApiModelProperty(value = "Encerrante inicial.", position = 12)
    public String encerranteinicial;
    @ApiModelProperty(value = "Encerrante final.", position = 13)
    public String encerrantefinal;

    @ApiModelProperty(value = "Valor da aliquota do ICMS.", position = 14)
    public String picms;
    @ApiModelProperty(value = "Valor calculado do ICMS, (Valor geral do ICMS * quantidade vendida).", position = 15)
    public String vicms;
    @ApiModelProperty(value = "Codigo da situação tributária do ICMS (SEFAZ).", position = 16)
    public String csticms;

    @ApiModelProperty(value = "CFOP (SEFAZ).", position = 17)
    public String cfop;


    @ApiModelProperty(value = "Valor da aliquota do PIS.", position = 18)
    public String ppis;
    @ApiModelProperty(value = "Valor calculado do PIS, (Valor geral do PIS * quantidade vendida).", position = 19)
    public String vpis;
    @ApiModelProperty(value = "Codigo da situação tributária do PIS (SEFAZ).", position = 20)
    public String cstpis;

    @ApiModelProperty(value = "Valor da aliquota do COFINS.", position = 21)
    public String pcofins;
    @ApiModelProperty(value = "Valor calculado do COFINS, (Valor geral do COFINS * quantidade vendida).", position = 22)
    public String vcofins;
    @ApiModelProperty(value = "Codigo da situação tributária do COFINS (SEFAZ).", position = 23)
    public String cstcofins;

    @ApiModelProperty(value = "Valor da aliquota do IPI.", position = 24)
    public String pipi;
    @ApiModelProperty(value = "Valor calculado do IPI, (Valor geral do IPI * quantidade vendida).", position = 25)
    public String vipi;
    @ApiModelProperty(value = "Codigo da situação tributária do IPI (SEFAZ).", position = 26)
    public String cstipi;
    @ApiModelProperty(value = "Codigo de enquadramento do IPI (SEFAZ).", position = 27)
    public String cenq;

    @ApiModelProperty(value = "Valor da base de calculo do ICMS.", position = 28)
    public String vbcicms;
    @ApiModelProperty(value = "Valor da base de calculo do PIS.", position = 29)
    public String vbcpis;
    @ApiModelProperty(value = "Valor da base de calculo do COFINS.", position = 30)
    public String vbccofins;
    @ApiModelProperty(value = "Valor da base de calculo do IPI.", position = 31)
    public String vbcipi;

    @ApiModelProperty(value = "Valor unitário do item.", position = 31)
    public BigDecimal valorunitario;

    
}
