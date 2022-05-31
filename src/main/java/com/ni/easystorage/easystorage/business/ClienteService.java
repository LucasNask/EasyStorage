package com.ni.easystorage.easystorage.business;

import com.ni.easystorage.easystorage.mapper.ClienteMapper;
import com.ni.easystorage.easystorage.model.Cliente;
import com.ni.easystorage.easystorage.repository.ClienteRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    @Cacheable(value = "documento", key = "#documento")
    public Cliente findByDocumento(String documento){
        return ClienteMapper.INSTANCE.mapFrom(clienteRepository.findByDocumento(documento));
    }

    public List<Cliente> findAll(){
        return  ClienteMapper.INSTANCE.mapFrom(clienteRepository.findAll());
    }

}
