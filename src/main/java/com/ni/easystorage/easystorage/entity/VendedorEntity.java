package com.ni.easystorage.easystorage.entity;

import javax.persistence.*;

@Entity
@Table(name = "cliente")
public class VendedorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nome;

    @Column
    private String documento;

    @Column
    private Boolean status;

}
