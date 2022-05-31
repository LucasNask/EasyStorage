package com.ni.easystorage.easystorage.entity;

import javax.persistence.*;

@Entity
@Table(name = "cliente")
public class ClienteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String cpfcnpj;

    @Column(nullable = false, unique = true)
    private String rg;

    @Column
    private String nome;

    @Column
    private String rua;

    @Column
    private Integer numero;

    @Column
    private String bairro;

    @Column
    private String firma;

    @Column
    private String telefone;

    @Column
    private String referencia;

}