package br.com.grands.fashionmanagerclient.modelo.caracteristica;


import br.com.grands.fashionmanagerclient.modelo.caracteristica.enums.OrigemCaracteristica;
import br.com.grands.fashionmanagerclient.modelo.caracteristica.enums.TipoCaracteristica;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public class Caracteristica {

    @ApiModelProperty(value = "Id da caracteristica do software que esta usando a integração", position = 1, required = true)
    public Long id;
    @ApiModelProperty(value = "Nome da caracteristica", position = 2, required = true)
    public String nome;
    @ApiModelProperty(value = "Tipo da caracteristica", position = 3,required = true)
    public TipoCaracteristica tipo;
    @ApiModelProperty(value = "Caso a caracteristica seja do tipo SELECAO ou MULTISELECAO, este atributo será obrigatório e " +
            "irá conter os valores possíveis da caracteristica", position = 4)
    public List<String> valores;
    @ApiModelProperty(hidden = true)
    public OrigemCaracteristica origem = OrigemCaracteristica.PRODUTO;
}
