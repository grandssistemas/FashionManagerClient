package br.com.grands.fashionmanagerclient.modelo.pessoa;


import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public class GrupoCliente {

    @ApiModelProperty(value = "Id do grupo de cliente do software que esta usando a integração", position = 1, required = true)
    public Long idintegracao;
    @ApiModelProperty(value = "Nome do grupo de cliente", position = 2, required = true)
    public String nome;
    @ApiModelProperty(value = "Status do grupo. True representa ativo e False inativo. O valor padao desse campo é TRUE", position = 3, required = true)
    public Boolean ativo = Boolean.TRUE;
    @ApiModelProperty(value = "Lista de marcadores", position = 3)
    public List<Marcador> marcadores;
    @ApiModelProperty(value = "Lista de pessoas associadas a este grupo", position = 4)
    public List<GrupoClienteAssociativa> pessoas;
}
