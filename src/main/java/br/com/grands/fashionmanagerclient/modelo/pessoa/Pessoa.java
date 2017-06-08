package br.com.grands.fashionmanagerclient.modelo.pessoa;

import br.com.grands.fashionmanagerclient.modelo.pessoa.enums.TipoPessoa;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import java.util.List;
import java.util.Set;

public class Pessoa {

    @ApiModelProperty(value = "Id da pessoa do software que esta usando a integração", position = 1, required = true)
    public Long idintegracao;
    @ApiModelProperty(value = "Tipo de pessoa. Valores válidos: ['FISICA','JURIDICA']", position = 2, required = true)
    public TipoPessoa tipo;
    @ApiModelProperty(value = "CPF da pessoa, caso ela seja pessoa física", position = 3)
    public String cpf;
    @ApiModelProperty(value = "RG da pessoa, caso ela seja pessoa física", position = 4)
    public String rg;
    @ApiModelProperty(value = "CNPJ da pessoa, caso ela seja pessoa jurídica", position = 5)
    public String cnpj;
    @ApiModelProperty(value = "Inscrição estadual da pessoa, caso ela seja pessoa jurídica", position = 6)
    public String ie;
    @ApiModelProperty(value = "Indicador da Inscrição Estadual da pessoa, caso ela seja pessoa jurídica. Valores Válidos: [1, 2, 9]", position = 7)
    public Integer indicadorie;
    @ApiModelProperty(value = "Data do cadastro da pessoa", position = 8, required = true)
    public Date datacadastro;
    @ApiModelProperty(value = "Grupo fiscal que a pessoa pertence", position = 9, required = true)
    public GrupoFiscalPessoa grupofiscalpessoa;
    @ApiModelProperty(value = "Status do cadastro da pessoa. True representa ativo e False inativo. O valor padao desse campo é TRUE", position = 10, required = true)
    public Boolean status = Boolean.TRUE;
    @ApiModelProperty(value = "Nome da pessoa, caso ela seja pessoa física", position = 11)
    public String nome;
    @ApiModelProperty(value = "Apelido da pessoa, caso ela seja pessoa física", position = 12)
    public String apelido;
    @ApiModelProperty(value = "Razão social da empresa, caso ela seja pessoa jurídica", position = 13)
    public String razao;
    @ApiModelProperty(value = "Nome fantasia da pessoa, caso ela seja pessoa jurídica", position = 14)
    public String fantasia;
    @ApiModelProperty(value = "Lista de papéis da pessoa. Informe os id's dos papéis já cadastrado.", position = 15, required = true)
    public List<Long> papeis;
    @ApiModelProperty(value = "Lista de endereços da pessoa, deve conter pelo menos 1 endereço. O primeiro endereço será considerado o endereço principal", position = 16)
    public List<Endereco> endereco;
    @ApiModelProperty(value = "Lista de emails da pessoa, deve conter pelo menos 1 email. O primeiro email será considerado o email principal", position = 17)
    public List<String> email;
    @ApiModelProperty(value = "Lista de telefones da pessoa, deve conter pelo menos 1 telefone. O primeiro telefone será considerado o telefone principal", position = 18)
    public List<String> telefone;
    @ApiModelProperty(value = "Lista de locais de faturamento. O primeiro local será considerado o principal", position = 18)
    public List<LocalFaturamento> localfaturamento;
    @ApiModelProperty(value = "Lista de marcadores.", position = 19)
    public List<Marcador> marcadores;
}
