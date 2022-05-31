package com.ni.easystorage.easystorage.repository;

import com.ni.easystorage.easystorage.entity.ClienteEntity;
import com.ni.easystorage.easystorage.entity.ProdutoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteEntity, Long> {

    ClienteEntity findByDocumento(String documento);

}
