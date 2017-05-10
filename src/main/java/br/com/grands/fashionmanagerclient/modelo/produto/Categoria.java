package br.com.grands.fashionmanagerclient.modelo.produto;


import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * Created by gelatti on 17/10/16.
 */
public class Categoria {

    @ApiModelProperty(value = "ID da categoria do software que esta usando integração", position = 1)
    public Long idintegracao;
    @ApiModelProperty(value = "Nome da categoria", position = 2, required = true)
    public String nome;
    @ApiModelProperty(value = "Tipos de produto que esta categoria possui", position = 3, required = true)
    public List<TipoProduto> tiposproduto;
    @ApiModelProperty(value = "Lista dos Ids das caracteristicas da categoria. " +
            "As caracteristicas devem ser cadastradas anteriormente", position = 4, required = true)
    public List<Long> caracteristicas;
}
