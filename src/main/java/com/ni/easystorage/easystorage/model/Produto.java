package com.ni.easystorage.easystorage.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Produto {

    private String descricao;

    private String ean;

    private String lote;

    private String numeroSerie;

    private Double peso;

    private Integer quantidade;

}
