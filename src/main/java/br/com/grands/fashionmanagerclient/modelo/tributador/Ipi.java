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
}
