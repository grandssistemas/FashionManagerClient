package br.com.grands.fashionmanagerclient.modelo.pessoa;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import java.util.List;

public class Pessoa {

    @ApiModelProperty(value = "Id da pessoa do software que esta usando a integração", position = 1, required = true)
    private Long id;
    @ApiModelProperty(value = "Tipo de pessoa. Valores válidos: ['FISICA','JURIDICA']", position = 2, required = true)
    private String tipo;
    @ApiModelProperty(value = "CPF da pessoa, caso ela seja pessoa física", position = 3)
    private String cpf;
    @ApiModelProperty(value = "RG da pessoa, caso ela seja pessoa física", position = 4)
    private String rg;
    @ApiModelProperty(value = "CNPJ da pessoa, caso ela seja pessoa jurídica", position = 5)
    private String cnpj;
    @ApiModelProperty(value = "Inscrição estadual da pessoa, caso ela seja pessoa jurídica", position = 6)
    private String ie;
    @ApiModelProperty(value = "Indicador da Inscrição Estadual da pessoa, caso ela seja pessoa jurídica. Valores Válidos: [1, 2, 9]", position = 7)
    private Integer indicadorIE;
    @ApiModelProperty(value = "Data do cadastro da pessoa", position = 8, required = true)
    private Date dataCadastro;
    @ApiModelProperty(value = "Grupo fiscal que a pessoa pertence", position = 9, required = true)
    private GrupoFiscalPessoa grupoFiscalPessoa;
    @ApiModelProperty(value = "Status do cadastro da pessoa. True representa ativo e False inativo", position = 10, required = true)
    private Boolean status;
    @ApiModelProperty(value = "Nome da pessoa, caso ela seja pessoa física", position = 11)
    private String nome;
    @ApiModelProperty(value = "Apelido da pessoa, caso ela seja pessoa física", position = 12)
    private String apelido;
    @ApiModelProperty(value = "Razão social da empresa, caso ela seja pessoa jurídica", position = 13)
    private String razao;
    @ApiModelProperty(value = "Nome fantasia da pessoa, caso ela seja pessoa jurídica", position = 14)
    private String fantasia;
    @ApiModelProperty(value = "Papel da pessoa. Valores válidos: ['CLIENTE','FORNECEDOR','FUNCIONARIO']",position = 15, required = true)
    private String papel;
    @ApiModelProperty(value = "Lista de endereços da pessoa, deve conter pelo menos 1 endereço. O primeiro endereço será considerado o endereço principal", position = 16)
    private List<Endereco> endereco;
    @ApiModelProperty(value = "Lista de emails da pessoa, deve conter pelo menos 1 email. O primeiro email será considerado o email principal", position = 17)
    private List<String> email;
    @ApiModelProperty(value = "Lista de telefones da pessoa, deve conter pelo menos 1 telefone. O primeiro telefone será considerado o telefone principal", position = 18)
    private List<String> telefone;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    public Integer getIndicadorIE() {
        return indicadorIE;
    }

    public void setIndicadorIE(Integer indicadorIE) {
        this.indicadorIE = indicadorIE;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public GrupoFiscalPessoa getGrupoFiscalPessoa() {
        return grupoFiscalPessoa;
    }

    public void setGrupoFiscalPessoa(GrupoFiscalPessoa grupoFiscalPessoa) {
        this.grupoFiscalPessoa = grupoFiscalPessoa;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getRazao() {
        return razao;
    }

    public void setRazao(String razao) {
        this.razao = razao;
    }

    public String getFantasia() {
        return fantasia;
    }

    public void setFantasia(String fantasia) {
        this.fantasia = fantasia;
    }

    public String getPapel() {
        return papel;
    }

    public void setPapel(String papel) {
        this.papel = papel;
    }

    public List<Endereco> getEndereco() {
        return endereco;
    }

    public void setEndereco(List<Endereco> endereco) {
        this.endereco = endereco;
    }

    public List<String> getEmail() {
        return email;
    }

    public void setEmail(List<String> email) {
        this.email = email;
    }

    public List<String> getTelefone() {
        return telefone;
    }

    public void setTelefone(List<String> telefone) {
        this.telefone = telefone;
    }
}
