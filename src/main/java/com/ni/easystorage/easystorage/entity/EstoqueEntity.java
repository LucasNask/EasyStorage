package com.ni.easystorage.easystorage.entity;

import com.ni.easystorage.easystorage.model.Produto;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@ToString

@Entity
@Table(name = "estoque")
public class EstoqueEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //TODO pedir ajuda pro @Igor do que fazer nesse caso. TESTE
    //private Produto produto;

    //private FornecedorEntity fornecedor;

    //TODO isso é realmente necessario?
    //private Integer quantidade;


}
