package br.edu.ifpb.padroes.model.builder;

public interface builderEndereco {
    builderEndereco setRua(String rua);
    builderEndereco setPais(String nome, String sigla);
    builderEndereco setEstado(String estado, String sigla);
    builderEndereco setCidade(String cidade);
    builderEndereco setComplemento(String complemento);
}
