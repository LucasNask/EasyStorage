package com.ni.easystorage.easystorage.business;

import com.ni.easystorage.easystorage.entity.ClienteEntity;
import com.ni.easystorage.easystorage.model.Cliente;
import com.ni.easystorage.easystorage.repository.ClienteRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ClienteServiceTest {

    @InjectMocks
    ClienteService clienteService;

    @Mock
    ClienteRepository repository;

    @Test
    public void testFindByDocumentoSuccess(){

        when(repository.findByDocumento(anyString())).thenReturn(new ClienteEntity());
        final Cliente result =  clienteService.findByDocumento(anyString());
        assertNotNull(result);

    }

    @Test
    public void testFindAllSuccess(){

        when(repository.findAll()).thenReturn(Arrays.asList(new ClienteEntity(), new ClienteEntity()));
        final List<Cliente> result =  clienteService.findAll();
        assertNotNull(result);
        assertEquals(2, result.size());

    }

}