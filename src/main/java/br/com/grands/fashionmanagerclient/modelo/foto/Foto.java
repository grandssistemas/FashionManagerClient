package br.com.grands.fashionmanagerclient.modelo.foto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.File;

@ApiModel(value = "Foto", description = "Objeto que representa uma foto. " +
        "No momento do cadastro, é obrigatório que este objeto possua uma url para uma foto, " +
        "ou um objeto do tipo File que representa o arquivo da imagem. " +
        "Se for passado um objeto, ele será salvo e depois disso será retornado o link da foto salva.")
public class Foto {

    @ApiModelProperty(value = "Id da foto no software que está realizando a integração", position = 1, required = true)
    public Long idintegracao;
    @ApiModelProperty(value = "Caso seja fornecida uma URL")
    public String imagemurl;
    @ApiModelProperty(value = "Id do arquivo no storage")
    public Long idstorage;
}
