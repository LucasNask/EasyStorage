package com.ni.easystorage.easystorage.entity;


import javax.persistence.*;


@Entity
@Table(name = "venda")
public class VendaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @JoinColumn(name="clienteFK",  unique=true)
    @OneToOne
    private ClienteEntity cliente;

    @Column
    @OneToMany
    private ProdutoEntity produto;

    @Column
    @OneToMany
    private VendedorEntity vendedor;

    @Column
    private Boolean status;

}
