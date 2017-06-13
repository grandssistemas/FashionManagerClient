package br.com.grands.fashionmanagerclient.modelo.produto;

import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

public class Fiscal {

    @ApiModelProperty(value = "Código NCM do produto")
    public String ncm;
    @ApiModelProperty(value = "Código CEST do produto", position = 1)
    public String cest;
    @ApiModelProperty(value = "Campo que armazena a origem do produto. Deve ser o valor da SEFAZ para o campo ORIG do imposto do item da Nfe",
            position = 3)
    public Integer origemdoproduto;
    @ApiModelProperty(value = "Valor de IPI do produto, caso o IPI seja cobrado por pauta", position = 4)
    public BigDecimal valoripi = BigDecimal.ZERO;
    @ApiModelProperty(value = "Valor de PIS do produto, caso o PIS seja cobrado por pauta", position = 5)
    public BigDecimal valorpis = BigDecimal.ZERO;
    @ApiModelProperty(value = "Valor de COFINS do produto, caso o COFINS seja cobrado por pauta", position = 6)
    public BigDecimal valorcofins = BigDecimal.ZERO;
    @ApiModelProperty(value = "Grupo Fiscal do produto", position = 7, required = true)
    public GrupoFiscalProduto grupofiscal;
    
}
