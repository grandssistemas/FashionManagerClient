package br.com.grands.fashionmanagerclient.modelo.tributador;

import br.com.grands.fashionmanagerclient.modelo.tributador.enums.CalculationType;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

/**
 * Created by gelatti on 03/11/16.
 */
public class Ipi {

    @ApiModelProperty(value = "CST que esta relacionado ao grupo de tributação", position = 1, required = true)
    public String cst;
    @ApiModelProperty(value = "Tipo de unidade para o calculo do IPI", position = 2)
    public CalculationType ipicalculationtype;
    @ApiModelProperty(value = "Nome da formula para o valor do IPI", position = 3)
    public String vipi;
    @ApiModelProperty(value = "Nome da formula para o valor da base de calculo do IPI", position = 4)
    public String vbc;
    @ApiModelProperty(value = "Percentual do IPI", position = 5)
    public BigDecimal pipi;
    @ApiModelProperty(value = "Mensagem que ira aparecer nas informações adicionais da nota", position = 6)
    public String mensagem;
}
