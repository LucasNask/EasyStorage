package com.ni.easystorage.easystorage.mapper;

import com.ni.easystorage.easystorage.entity.ClienteEntity;
import com.ni.easystorage.easystorage.entity.ProdutoEntity;
import com.ni.easystorage.easystorage.model.Cliente;
import com.ni.easystorage.easystorage.model.Produto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ClienteMapper {

    ClienteMapper INSTANCE = Mappers.getMapper(ClienteMapper.class);

    List<Cliente> mapFrom(List<ClienteEntity> source);

    Cliente mapFrom(ClienteEntity source);

}
