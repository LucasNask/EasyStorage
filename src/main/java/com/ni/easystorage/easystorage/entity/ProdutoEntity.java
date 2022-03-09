package com.ni.easystorage.easystorage.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@ToString
@NoArgsConstructor

@Entity
@Table(name = "produto")
public class ProdutoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String descricao;

    @Column
    private Long ean;

    @Column
    private String lote;

    @Column
    private String numeroSerie;

    @Column
    private Double peso;

    @Column
    private Integer quantidade;

}
