package br.com.grands.fashionmanagerclient.modelo.tributador;

import br.com.grands.fashionmanagerclient.modelo.tributador.enums.CalculationType;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

/**
 * Created by gelatti on 03/11/16.
 */
public class Cofins {

    @ApiModelProperty(value = "Nome da formula para o valor da base de calculo do COFINS", position = 1)
    public String vbc;
    @ApiModelProperty(value = "Nome da formula para o valor do COFINS", position = 2)
    public String vcofins;
    @ApiModelProperty(value = "Nome da formula para o valor por unidade tributável", position = 3)
    public String vunid;
    @ApiModelProperty(value = "Percentual do COFINS", position = 4)
    public BigDecimal pcofins;
    @ApiModelProperty(value = "Tipo de unidade para o calculo do COFINS", position = 5)
    public CalculationType calculationtype;
    @ApiModelProperty(value = "Tipo de unidade para o calculo do COFINS ST", position = 6)
    public CalculationType calculationtypest;
    @ApiModelProperty(value = "Nome da formula para o valor da base de calculo do COFINS ST", position = 7)
    public String vbcst;
    @ApiModelProperty(value = "Nome da formula para o valor do COFINS ST", position = 8)
    public String vcofinsst;
    @ApiModelProperty(value = "Percentual do COFINS ST", position = 9)
    public BigDecimal pcofinsst;
    @ApiModelProperty(value = "Mensagem que ira aparecer nas informações adicionais da nota", position = 10)
    public String mensagem;
    @ApiModelProperty(value = "CST que esta relacionado ao grupo de tributação", position = 11, required = true)
    public String cst;
}
