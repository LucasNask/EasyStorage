package com.ni.easystorage.easystorage.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Produto {

    private Long id;

    private String descricao;

    private Long ean;

    private String lote;

    private String numeroSerie;

    private Double peso;

    private Integer qtd;

}
