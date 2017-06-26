package br.com.grands.fashionmanagerclient.modelo.vendanova;

import br.com.grands.fashionmanagerclient.modelo.pessoa.Marcador;
import br.com.grands.fashionmanagerclient.modelo.pessoa.Pessoa;
import br.com.grands.fashionmanagerclient.modelo.vendanova.enums.StatusVenda;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import java.util.List;

public class Venda {

    @ApiModelProperty(value = "Id da venda no software que realiza a integração", required = true)
    public Long idintegracao;

    @ApiModelProperty("Numero do pedido no software que realiza a integração. " +
            "Caso não seja passado nenhum valor, será gerado um código sequencial da venda e atribuido á esse valor")
    public Long numpedido;

    @ApiModelProperty(value = "Data da realizacao da venda", required = true)
    public Date dataemissao;

    @ApiModelProperty(value = "Data da entrega da venda")
    public Date dataentrega;

    @ApiModelProperty("Lista com os ids dos vendedores responsáveis pela venda")
    public List<Long> vendedores;

    @ApiModelProperty("Marcadores à serem usados para identificar a venda")
    public List<Marcador> marcadores;

    @ApiModelProperty(value = "Cliente que realizou a venda. " +
            "Se existir um cliente com o id informado, será utilizado ele. " +
            "Caso contrário, será cadastrado um novo cliente com os dados informados", required = true)
    public Pessoa cliente;

    @ApiModelProperty(value = "Lista dos itens da venda", required = true)
    public List<ItemVenda> itens;

    @ApiModelProperty("Lista dos pagamentos da venda")
    public List<Pagamento> pagamentos;

    @ApiModelProperty(value = "Status atual da venda")
    public StatusVenda status = StatusVenda.ABERTO;

    @ApiModelProperty(value = "Flag que indica se será emitida nota no momento da integração. O valor padrão desse campo é falso")
    public Boolean emitirnota = Boolean.FALSE;

    public Venda() {
    }
}
