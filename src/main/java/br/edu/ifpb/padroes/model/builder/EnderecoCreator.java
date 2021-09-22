package br.edu.ifpb.padroes.model.builder;

import br.edu.ifpb.padroes.model.Cidade;
import br.edu.ifpb.padroes.model.Estado;
import br.edu.ifpb.padroes.model.Pais;

public class EnderecoCreator implements builderEndereco{

    private String rua;
    private Pais pais;
    private Estado estado;
    private Cidade cidade;
    private String complemento;

    public EnderecoCreator() {
    }

    public EnderecoCreator(String rua, Pais pais, Estado estado, Cidade cidade, String complemento) {
        this.rua = rua;
        this.pais = pais;
        this.estado = estado;
        this.cidade = cidade;
        this.complemento = complemento;
    }

    @Override
    public EnderecoCreator setRua(String rua) {
        this.rua = rua;
        return this;
    }

    @Override
    public EnderecoCreator setPais(String nome, String sigla) {
        this.pais = new Pais(nome, sigla);
        return this;
    }

    @Override
    public EnderecoCreator setEstado(String estado, String sigla) {
        this.estado = new Estado(estado, sigla);
        return this;
    }

    @Override
    public EnderecoCreator setCidade(String cidade) {
        this.cidade = new Cidade(cidade);
        return this;
    }
    @Override
    public EnderecoCreator setComplemento(String complemento) {
        this.complemento = complemento;
        return this;
    }

    public Endereco getResult() {
        return new Endereco(rua, cidade, estado, pais, complemento);
    }

}
