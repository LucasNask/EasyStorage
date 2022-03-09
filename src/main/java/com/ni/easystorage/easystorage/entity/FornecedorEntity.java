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

    @Column
    private String nome;

    @Column
    private String CNPJ;

    @Column
    private String telefone;

    @Column
    private Boolean flagExterior;

    //TODO locais (endereço)
}
