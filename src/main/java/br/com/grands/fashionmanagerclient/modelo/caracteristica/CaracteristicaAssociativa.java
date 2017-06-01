package br.com.grands.fashionmanagerclient.modelo.caracteristica;


import io.swagger.annotations.ApiModelProperty;

public class CaracteristicaAssociativa {

    @ApiModelProperty(value = "Id da Caracteristica que será utilizada na associação. " +
            "A caracteristica deve estar cadastrada anteriormente", required = true)
    public Long idcaracteristica;
    @ApiModelProperty(value = "Atributo que indica se nesta associação, a caracteristica é obrigatória ou não. O valor padrão é FALSE", position = 1)
    public Boolean obrigatoria = Boolean.FALSE;
}
