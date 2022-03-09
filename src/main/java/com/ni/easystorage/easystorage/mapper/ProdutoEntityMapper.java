package com.ni.easystorage.easystorage.mapper;

import com.ni.easystorage.easystorage.entity.ProdutoEntity;
import com.ni.easystorage.easystorage.model.Produto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface ProdutoEntityMapper {

    ProdutoEntityMapper INSTANCE = Mappers.getMapper(ProdutoEntityMapper.class);

    @Mapping(target = "qtd",source = "quantidade")
    Produto entityToDTO(ProdutoEntity source);

    List<Produto> mapToList(List<ProdutoEntity> source);

}
