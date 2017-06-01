package br.com.grands.fashionmanagerclient.modelo.produto;


import br.com.grands.fashionmanagerclient.modelo.caracteristica.CaracteristicaAssociativa;
import br.com.grands.fashionmanagerclient.modelo.produto.enums.Especificacao;
import br.com.grands.fashionmanagerclient.modelo.produto.enums.TipoEtiqueta;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * Created by gelatti on 17/10/16.
 */
public class TipoProduto {

    @ApiModelProperty(value = "Id do tipo de produto do software que esta usando integração", position = 1)
    public Long idintegracao;
    @ApiModelProperty(value = "Nome do tipo de produto", position = 2, required = true)
    public String nome;
    @ApiModelProperty(value = "Campo que informa os ids das características que formam a grade, caso o tipo de produto seja de grade", position = 3)
    public Long[] grade;
    @ApiModelProperty(value = "Tipo da etiqueta dos produtos pertencentes à esse grupo. " +
            "Esse campo se o produto será de balança ou não. O valor padrão desse campo é UNIDADE",
            position = 4)
    public TipoEtiqueta tipoetiqueta = TipoEtiqueta.UNIDADE;
    @ApiModelProperty(value = "Lista de características do tipo de produto.", position = 5)
    public List<CaracteristicaAssociativa> caracteristicas;

    @ApiModelProperty(value = "Caso os produtos desse tipo de produto exijam campos adicionais para a emissão de documentos fiscais, " +
            "este campo conterá qual especificação esses produtos terão.", position = 6)
    public Especificacao especificacao;
}
