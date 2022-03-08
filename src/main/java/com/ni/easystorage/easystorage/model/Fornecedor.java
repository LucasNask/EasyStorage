package com.ni.easystorage.easystorage.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;

@Getter
@Setter
@ToString
public class Fornecedor {

    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "CNPJ")
    private String CNPJ;

    @Column(name = "telefone")
    private String telefone;

    @Column(name = "flagExterior")
    private Boolean flagExterior;

    //TODO locais (endereço)
}
