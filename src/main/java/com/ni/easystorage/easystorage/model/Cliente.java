package com.ni.easystorage.easystorage.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Cliente {

    private String nome;
    private String rua;
    private Integer numero;
    private String bairro;
    private String firma;
    private String cpfcnpj;
    private String rg;
    private String telefone;
    private String referencia;

}
