package br.com.grands.fashionmanagerclient.modelo.produto;

import br.com.grands.fashionmanagerclient.modelo.produto.enums.TipoBarras;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;

/**
 * Created by luizaugusto on 18/04/17.
 */
public class CodigoBarras {

    @ApiModelProperty("Valor do código de barras, esse campo aceita números e letras e só será validado se for informado o tipo GTIN. " +
            "Caso não for informado, será gerado um código pelo sistema")
    public String codigo;
    @ApiModelProperty(value = "Valor de venda do código de barras, caso não for informado, será utilizado o valor do produto.", position = 1)
    public BigDecimal valorVenda;
    @ApiModelProperty(value = "Valor de custo do código de barras, caso não for informado, será utilizado o valor do produto.", position = 2)
    public BigDecimal valorCusto;
    @ApiModelProperty(value = "Tipo do código de barras. Campo utilizado para definir se o código de barras vai ser validado ou não no cadastro. O valor padrão desse atributo é PROPRIO", position = 3)
    public TipoBarras tipo = TipoBarras.PROPRIO;
    @ApiModelProperty(value = "Quantidade do produto que será movimentada quando este código de barras for utilizado em alguma movimentação. O valor padrão deste campo é 1. Caso seja enviado um valor menor ou igual à 0, será setado como 1", position = 4)
    public BigDecimal quantidadeBaixa = BigDecimal.ONE;
    @ApiModelProperty(value = "Nome do código de barras. Caso não for informado, será utilizado o nome do produto.", position = 5)
    public String nome;
}
