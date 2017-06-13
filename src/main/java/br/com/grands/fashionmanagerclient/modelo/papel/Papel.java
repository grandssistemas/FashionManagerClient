package br.com.grands.fashionmanagerclient.modelo.papel;

import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * Created by nakamura on 06/06/17.
 */
public class Papel {

    @ApiModelProperty(value = "Id do papel do software que esta usando a integração", position = 1, required = true)
    public Long idintegracao;

    @ApiModelProperty(value = "Nome do papel", position = 2, required = true)
    public String nome;

    @ApiModelProperty(value = "Lista de atributos para esta regra de papel.", position = 3, required = true)
    public List<GrupoPapelAtributo> listaGrupoAtributos;

    @ApiModelProperty(value = "Especifica qual será a cor de fundo deste papel que deve ser informada em hexadecimal, exemplo: #f8ac59", position = 4, required = true)
    public String cor;

    public Papel() {

    }

    public Papel(Long idintegracao, String nome, List<GrupoPapelAtributo> listaGrupoAtributos, String cor) {
        this.idintegracao = idintegracao;
        this.nome = nome;
        this.listaGrupoAtributos = listaGrupoAtributos;
        this.cor = cor;
    }
}
