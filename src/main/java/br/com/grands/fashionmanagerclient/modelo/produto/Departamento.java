package br.com.grands.fashionmanagerclient.modelo.produto;


import io.swagger.annotations.ApiModelProperty;

import java.util.List;

/**
 * Created by gelatti on 17/10/16.
 */
public class Departamento {

    @ApiModelProperty(value = "Id do departamento do software que esta usando integração", position = 1)
    public Long id;
    @ApiModelProperty(value = "Nome do departamento", position = 2, required = true)
    public String nome;
    @ApiModelProperty(value = "Categoria que este departamento possui", position = 3, required = true)
    public List<Categoria> categoria;
    @ApiModelProperty(value = "Lista dos Ids das caracteristicas do departamento. " +
            "As caracteristicas devem ser cadastradas anteriormente", position = 4, required = true)
    public List<Long> caracteristicas;
}
