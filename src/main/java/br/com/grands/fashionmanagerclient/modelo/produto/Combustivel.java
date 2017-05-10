package br.com.grands.fashionmanagerclient.modelo.produto;

import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.List;

public class Combustivel extends Produto {

    @ApiModelProperty(value = "Código da agencia nacional do petroleo", position = 14)
    public String codigoanp;
    @ApiModelProperty(value = "Percentual de gás natural", position = 15)
    public BigDecimal percentualgasnatural;
    @ApiModelProperty(value = "Código do CODIF", position = 16)
    public String codif;

    public Combustivel (){

    }

    public Combustivel(Produto produto){
        super(produto);
    }

    public Combustivel(Combustivel combustivel){
        this((Produto) combustivel);
        this.codigoanp = combustivel.codigoanp;
        this.percentualgasnatural = combustivel.percentualgasnatural;
        this.codif = combustivel.codif;
    }


}
