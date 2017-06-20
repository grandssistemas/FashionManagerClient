package br.com.grands.fashionmanagerclient.modelo.papel;

import br.com.grands.fashionmanagerclient.modelo.caracteristica.CaracteristicaAssociativa;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * Created by nakamura on 06/06/17.
 */
public class GrupoPapelAtributo {

    @ApiModelProperty(value = "Lista de regra de atributos referentes a este grupo", position = 1, required = true)
    public List<CaracteristicaAssociativa> listaCaracteristicasAssociativas;

    @ApiModelProperty(value = "Nome do grupo de atributos de papel", position = 2, required = true)
    public String nome;

    public GrupoPapelAtributo() {

    }

    public GrupoPapelAtributo(List<CaracteristicaAssociativa> listaCaracteristicasAssociativas, String nome) {
        this.listaCaracteristicasAssociativas = listaCaracteristicasAssociativas;
        this.nome = nome;
    }

}