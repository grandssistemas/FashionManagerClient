package br.com.grands.fashionmanagerclient.modelo.tipopagamento;

import br.com.grands.fashionmanagerclient.modelo.tipopagamento.enums.FormaPagamento;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

public class Pagamento {

    @ApiModelProperty(value = "Nome da forma de pagamento",required = true)
    public FormaPagamento pai;

    @ApiModelProperty(value="Lista de categorias de pagamento referentes à esta forma.", required = true)
    public List<CategoriaPagamento> categoria;

    public Pagamento() {
    }

    public Pagamento(FormaPagamento pai, List<CategoriaPagamento> categoria) {
        this.pai = pai;
        this.categoria = categoria;
    }
}
