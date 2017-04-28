package br.com.grands.fashionmanagerclient.modelo.tributador;

import br.com.grands.fashionmanagerclient.modelo.tributador.enums.CalculationType;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

/**
 * Created by gelatti on 03/11/16.
 */
public class Pis {

    @ApiModelProperty(value = "CST que esta relacionado ao grupo de tributação", position = 1, required = true)
    public String CST;
    @ApiModelProperty(value = "Nome da formula para o valor da base de calculo do PIS", position = 2)
    public String vBC;
    @ApiModelProperty(value = "Nome da formula para o valor do PIS", position = 3)
    public String vPIS;
    @ApiModelProperty(value = "Percentual do PIS", position = 4)
    public BigDecimal pPIS;
    @ApiModelProperty(value = "Nome da formula para o valor da base de calculo do PIS ST", position = 5)
    public String vBCST;
    @ApiModelProperty(value = "Nome da formula para o valor do PIS ST", position = 6)
    public String vPISST;
    @ApiModelProperty(value = "Percentual do PIS ST", position = 7)
    public BigDecimal pPISST;
    @ApiModelProperty(value = "Tipo de unidade para o calculo do PIS", position = 8)
    public CalculationType calculationType;
    @ApiModelProperty(value = "Tipo de unidade para o calculo do PIS ST", position = 9)
    public CalculationType calculationTypeST;
    @ApiModelProperty(value = "Mensagem que ira aparecer nas informações adicionais da nota", position = 10)
    public String mensagem;
}
