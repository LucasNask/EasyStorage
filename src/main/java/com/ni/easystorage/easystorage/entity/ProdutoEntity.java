package com.ni.easystorage.easystorage.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "produto")
public class ProdutoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String descricao;

    @Column(unique=true)
    private String ean;

    @Column
    private String lote;

    @Column
    private String numeroSerie;

    @Column
    private Double peso;

    @Column
    private Integer quantidade;

}
