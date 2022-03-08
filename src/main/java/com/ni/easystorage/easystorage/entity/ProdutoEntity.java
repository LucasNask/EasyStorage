package com.ni.easystorage.easystorage.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@ToString

@Entity
@Table(name = "produto")
public class ProdutoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "ean")
    private Long ean;

    @Column(name = "lote")
    private String lote;

    @Column(name = "numeroSerie")
    private String numeroSerie;

    @Column(name = "peso")
    private Double peso;

    //private Integer quantidade;
}
