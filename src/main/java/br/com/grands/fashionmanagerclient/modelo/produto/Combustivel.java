package br.com.grands.fashionmanagerclient.modelo.produto;

import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

/**
 * Created by luizaugusto on 18/04/17.
 */
public class Combustivel extends Produto {

    @ApiModelProperty(value = "Código da agencia nacional do petroleo", position = 14)
    public String codigoANP;
    @ApiModelProperty(value = "Percentual de gás natural", position = 15)
    public BigDecimal percentualGasNatural;
    @ApiModelProperty(value = "Código do CODIF", position = 16)
    public String codif;
}
