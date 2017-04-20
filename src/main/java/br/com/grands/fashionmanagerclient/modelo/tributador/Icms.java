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
    public String CST;
    @ApiModelProperty(value = "Modalidade de determinação da BC do ICMS", position = 3)
    public String modBC;
    @ApiModelProperty(value = "Modalidade de determinação da BC do ICMS ST", position = 4)
    public String modBCST;
    @ApiModelProperty(value = "Nome da formula para o valor da base de calculo do ICMS", position = 5)
    public String vBC;
    @ApiModelProperty(value = "Nome da formula para o valor da base de calculo do ICMS ST", position = 6)
    public String vBCST;
    @ApiModelProperty(value = "Percentual do ICMS", position = 7)
    public BigDecimal pICMS;
    @ApiModelProperty(value = "Percentual do ICMS ST", position = 8)
    public BigDecimal pICMSST;
    @ApiModelProperty(value = "Nome da formula para o valor do ICMS", position = 9)
    public String vICMS;
    @ApiModelProperty(value = "Nome da formula para o valor da base de calculo do ICMS ST retido", position = 10)
    public String vBCSTRet;
    @ApiModelProperty(value = "Nome da formula para o valor do ICMS ST retido", position = 11)
    public String vICMSSTRet;
    @ApiModelProperty(value = "Nome da formula para o valor da base de calculo do ICMS ST da UF destino", position = 12)
    public String vBCSTDest;
    @ApiModelProperty(value = "Nome da formula para o valor do ICMS ST", position = 13)
    public String vICMSST;
    @ApiModelProperty(value = "Percentual da margem de valor Adicionado do ICMS ST", position = 14)
    public BigDecimal pMVAST;
    @ApiModelProperty(value = "Percentual da redução de base de calculo do ICMS", position = 15)
    public BigDecimal pRedBC;
    @ApiModelProperty(value = "Percentual da redução de base de calculo do ICMS ST", position = 16)
    public BigDecimal pRedBCST;
    @ApiModelProperty(value = "Percentual da base de calculo operação própria", position = 17)
    public BigDecimal pBCOp;
    @ApiModelProperty(value = "Motivo da desoneração do ICMS", position = 18)
    public String motDesICMS;
    @ApiModelProperty(value = "Nome da formula para o valor do ICMS ST da UF destino", position = 19)
    public String vICMSSTDest;
    @ApiModelProperty(value = "Nome da formula para o valor do ICMS da operação", position = 20)
    public String vICMSOp;
    @ApiModelProperty(value = "Percentual do diferimento", position = 21)
    public BigDecimal pDif;
    @ApiModelProperty(value = "Nome da formula para o valor do ICMS diferido", position = 22)
    public String vICMSDif;
    @ApiModelProperty(value = "Nome da formula para o valor do ICMS desonerado", position = 23)
    public String vICMSDeson;
    @ApiModelProperty(value = "Mensagem que ira aparecer nas informações adicionais da nota", position = 24)
    public String mensagem;
    @ApiModelProperty(value = "UF para qual é devido o ICMS ST", position = 25)
    public String UFST;
    @ApiModelProperty(value = "Percentual de redução do ICMS ST proprio", position = 26)
    public BigDecimal pRedIMCSSTProp;
    @ApiModelProperty(value = "CSOSN que esta relacionado ao grupo de tributação", position = 27)
    public String CSOSN;
    @ApiModelProperty(value = "Alíquota aplicável de cálculo do crédito (Simples Nacional)", position = 28)
    public BigDecimal pCredSN;
    @ApiModelProperty(value = "Nome da formula para o valor crédito do ICMS (Simples Nacional)", position = 29)
    public String vCredICMSSN;
    @ApiModelProperty(value = "Percentual do fundo de combate a pobreza da UF destino", position = 30)
    public BigDecimal pFCPUFDest;
    @ApiModelProperty(value = "Percentual do ICMS da UF destino", position = 31)
    public BigDecimal pICMSUFDest;
}
