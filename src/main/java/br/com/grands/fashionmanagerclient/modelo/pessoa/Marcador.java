package br.com.grands.fashionmanagerclient.modelo.pessoa;

import io.swagger.annotations.ApiModelProperty;

/**
 * Created by nakamura on 08/06/17.
 */
public class Marcador {
    @ApiModelProperty(value = "Atributo que armazena o valor do marcador.", position = 1)
    public String value;

    public Marcador() {

    }

    public Marcador(String value) {
        this.value = value;
    }
}

