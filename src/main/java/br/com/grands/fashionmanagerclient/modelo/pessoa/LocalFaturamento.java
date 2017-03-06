package br.com.grands.fashionmanagerclient.modelo.pessoa;

import io.swagger.annotations.ApiModelProperty;


public class LocalFaturamento {

    @ApiModelProperty(value = "Id da local de faturamento no software que esta usando a integração", position = 1, required = true)
    private Long id;
    @ApiModelProperty(value = "Nome do local de faturamento", position = 2, required = true)
    private String nome;
    @ApiModelProperty(value = "Documento associado ao local de faturamento. Exemplo: Inscrição rural", position = 3)
    private String documento;
    @ApiModelProperty(value = "Endereço do local de faturamento", position = 4, required = true)
    private Endereco endereco;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
