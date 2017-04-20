package br.com.grands.fashionmanagerclient.modelo.produto;


import br.com.grands.fashionmanagerclient.modelo.produto.enums.TipoEtiqueta;
import io.swagger.annotations.ApiModelProperty;

/**
 * Created by gelatti on 17/10/16.
 */
public class TipoProduto {

    @ApiModelProperty(value = "Id do tipo de produto do software que esta usando integração", position = 1)
    public Long id;
    @ApiModelProperty(value = "Nome do tipo de produto", position = 2, required = true)
    public String nome;
    @ApiModelProperty(value = "Campo que informa os ids das características que formam a grade, caso o tipo de produto seja de grade", position = 3)
    public Long[] grade;
    @ApiModelProperty(value = "Tipo da etiqueta dos produtos pertencentes à esse grupo. " +
            "Esse campo se o produto será de balança ou não. O valor padrão desse campo é UNIDADE",
            position = 4)
    public TipoEtiqueta tipoEtiqueta = TipoEtiqueta.UNIDADE;
}
