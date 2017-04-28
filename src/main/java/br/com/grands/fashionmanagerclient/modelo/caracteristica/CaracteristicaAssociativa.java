package br.com.grands.fashionmanagerclient.modelo.caracteristica;


import io.swagger.annotations.ApiModelProperty;

/**
 * Created by luizaugusto on 20/04/17.
 */
public class CaracteristicaAssociativa {

    @ApiModelProperty(value = "Id da Caracteristica que será utilizada na associação. " +
            "A caracteristica deve estar cadastrada anteriormente", required = true)
    public Long caracteristicaId;
    @ApiModelProperty(value = "Atributo que indica se nesta associação, a caracteristica é obrigatória ou não. O valor padrão é FALSE", position = 1)
    public Boolean obrigatoria = Boolean.FALSE;
}
