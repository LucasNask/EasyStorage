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

    private String nome;

    private String CNPJ;

    private String telefone;

    private Boolean flagExterior;

    //TODO locais (endereço)
}
