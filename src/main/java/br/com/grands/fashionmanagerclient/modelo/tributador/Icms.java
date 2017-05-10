package br.com.grands.fashionmanagerclient.modelo.tributador;

import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

/**
 * Created by gelatti on 03/11/16.
 */
public class Icms {

    @ApiModelProperty(value = "CFOP que esta relacionado ao grupo de tributação", position = 1, required = true)
    public String cfop;
    @ApiModelProperty(value = "CST que esta relacionado ao grupo de tributação", position = 2)
    public String cst;
    @ApiModelProperty(value = "Modalidade de determinação da BC do ICMS", position = 3)
    public String modbc;
    @ApiModelProperty(value = "Modalidade de determinação da BC do ICMS ST", position = 4)
    public String modbcst;
    @ApiModelProperty(value = "Nome da formula para o valor da base de calculo do ICMS", position = 5)
    public String vbc;
    @ApiModelProperty(value = "Nome da formula para o valor da base de calculo do ICMS ST", position = 6)
    public String vbcst;
    @ApiModelProperty(value = "Percentual do ICMS", position = 7)
    public BigDecimal picms;
    @ApiModelProperty(value = "Percentual do ICMS ST", position = 8)
    public BigDecimal picmsst;
    @ApiModelProperty(value = "Nome da formula para o valor do ICMS", position = 9)
    public String vicms;
    @ApiModelProperty(value = "Nome da formula para o valor da base de calculo do ICMS ST retido", position = 10)
    public String vbcstret;
    @ApiModelProperty(value = "Nome da formula para o valor do ICMS ST retido", position = 11)
    public String vicmsstret;
    @ApiModelProperty(value = "Nome da formula para o valor da base de calculo do ICMS ST da UF destino", position = 12)
    public String vbcstdest;
    @ApiModelProperty(value = "Nome da formula para o valor do ICMS ST", position = 13)
    public String vicmsst;
    @ApiModelProperty(value = "Percentual da margem de valor Adicionado do ICMS ST", position = 14)
    public BigDecimal pmvast;
    @ApiModelProperty(value = "Percentual da redução de base de calculo do ICMS", position = 15)
    public BigDecimal predbc;
    @ApiModelProperty(value = "Percentual da redução de base de calculo do ICMS ST", position = 16)
    public BigDecimal predbcst;
    @ApiModelProperty(value = "Percentual da base de calculo operação própria", position = 17)
    public BigDecimal pbcop;
    @ApiModelProperty(value = "Motivo da desoneração do ICMS", position = 18)
    public String motdesicms;
    @ApiModelProperty(value = "Nome da formula para o valor do ICMS ST da UF destino", position = 19)
    public String vicmsstdest;
    @ApiModelProperty(value = "Nome da formula para o valor do ICMS da operação", position = 20)
    public String vicmsop;
    @ApiModelProperty(value = "Percentual do diferimento", position = 21)
    public BigDecimal pdif;
    @ApiModelProperty(value = "Nome da formula para o valor do ICMS diferido", position = 22)
    public String vicmsdif;
    @ApiModelProperty(value = "Nome da formula para o valor do ICMS desonerado", position = 23)
    public String vicmsdeson;
    @ApiModelProperty(value = "Mensagem que ira aparecer nas informações adicionais da nota", position = 24)
    public String mensagem;
    @ApiModelProperty(value = "UF para qual é devido o ICMS ST", position = 25)
    public String ufst;
    @ApiModelProperty(value = "Percentual de redução do ICMS ST proprio", position = 26)
    public BigDecimal predimcsstprop;
    @ApiModelProperty(value = "CSOSN que esta relacionado ao grupo de tributação", position = 27)
    public String csosn;
    @ApiModelProperty(value = "Alíquota aplicável de cálculo do crédito (Simples Nacional)", position = 28)
    public BigDecimal pcredsn;
    @ApiModelProperty(value = "Nome da formula para o valor crédito do ICMS (Simples Nacional)", position = 29)
    public String vcredicmssn;
    @ApiModelProperty(value = "Percentual do fundo de combate a pobreza da UF destino", position = 30)
    public BigDecimal pfcpufdest;
    @ApiModelProperty(value = "Percentual do ICMS da UF destino", position = 31)
    public BigDecimal picmsufdest;
}
