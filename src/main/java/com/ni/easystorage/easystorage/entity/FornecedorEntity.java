package com.ni.easystorage.easystorage.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString

@Entity
@Table(name = "fornecedor")
public class FornecedorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
