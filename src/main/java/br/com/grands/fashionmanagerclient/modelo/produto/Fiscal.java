package br.com.grands.fashionmanagerclient.modelo.produto;

import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

public class Fiscal {

    @ApiModelProperty(value = "Código NCM do produto")
    public String ncm;
    @ApiModelProperty(value = "Código CEST do produto", position = 1)
    public String cest;
    @ApiModelProperty(value = "Valor de IPI do produto, caso o IPI seja cobrado por pauta", position = 2)
    public BigDecimal vlIpi = BigDecimal.ZERO;
    @ApiModelProperty(value = "Código de enquadramento de IPI do produto", position = 3)
    public String tipoIpi;
    @ApiModelProperty(value = "Campo que armazena a origem do produto. Deve ser o valor da SEFAZ para o campo ORIG do imposto do item da Nfe",
            position = 4)
    public Integer origem;
    @ApiModelProperty(value = "Valor de PIS do produto, caso o PIS seja cobrado por pauta", position = 5)
    public BigDecimal vlPis = BigDecimal.ZERO;
    @ApiModelProperty(value = "Valor de COFINS do produto, caso o COFINS seja cobrado por pauta", position = 6)
    public BigDecimal vlCofins = BigDecimal.ZERO;
    @ApiModelProperty(value = "Grupo Fiscal do produto", position = 7, required = true)
    public GrupoFiscalProduto grupoFiscalProduto;
    
}
