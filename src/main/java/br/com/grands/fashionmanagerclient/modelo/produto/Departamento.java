package br.com.grands.fashionmanagerclient.modelo.produto;


import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * Created by gelatti on 17/10/16.
 */
public class Departamento {

    @ApiModelProperty(value = "Id do departamento do software que esta usando integração", position = 1)
    public Long idintegracao;
    @ApiModelProperty(value = "Nome do departamento", position = 2, required = true)
    public String nome;
    @ApiModelProperty(value = "Categorias que este departamento possui", position = 3, required = true)
    public List<Categoria> categorias;
    @ApiModelProperty(value = "Lista dos Ids das caracteristicas do departament. " +
            "As caracteristicas devem ser cadastradas anteriormente", position = 4, required = true)
    public List<Long> caracteristicas;
}
