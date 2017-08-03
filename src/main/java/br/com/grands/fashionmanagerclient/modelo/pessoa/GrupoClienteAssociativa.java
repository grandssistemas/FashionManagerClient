package br.com.grands.fashionmanagerclient.modelo.pessoa;

import io.swagger.annotations.ApiModelProperty;

public class GrupoClienteAssociativa {

    @ApiModelProperty(value = "Status do cliente. True representa ativo e False inativo. O valor padao desse campo é TRUE", position = 1, required = true)
    public Boolean ativo = Boolean.TRUE;
    @ApiModelProperty(value = "Nome fantasia do cliente", position = 2, required = true)
    public String nomefantasia;
    @ApiModelProperty(value = "Razão social do cliente", position = 3, required = true)
    public String razaosocial;
    @ApiModelProperty(value = "Raz do cliente", position = 4)
    public String raiz;
    @ApiModelProperty(value = "CNPJ do cliente", position = 5, required = true)
    public String cnpj;
    @ApiModelProperty(value = "Pessoa vinculada com esse cliente", position = 6)
    public Pessoa pessoa;
}
