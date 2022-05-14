package com.ni.easystorage.easystorage.mapper;

import com.ni.easystorage.easystorage.entity.ProdutoEntity;
import com.ni.easystorage.easystorage.model.Produto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProdutoMapper {

    ProdutoMapper INSTANCE = Mappers.getMapper(ProdutoMapper.class);

    Produto mapFrom(ProdutoEntity source);

    List<Produto> mapFrom(List<ProdutoEntity> source);


}
