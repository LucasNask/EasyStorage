package com.ni.easystorage.easystorage.mapper;

import com.ni.easystorage.easystorage.entity.ClienteEntity;
import com.ni.easystorage.easystorage.model.Cliente;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(MockitoJUnitRunner.class)
class ClienteMapperTest {

    @Test
    void testSucess(){
        Cliente result = ClienteMapper.INSTANCE.mapFrom(new ClienteEntity());
        assertNotNull(result);
    }

    @Test
    void testSucessList(){
        List<ClienteEntity> asList = Arrays.asList(new ClienteEntity(), new ClienteEntity());

        List<Cliente> result = ClienteMapper.INSTANCE.mapFrom(asList);
        assertNotNull(result);
        assertEquals(2, result.size());
    }


}