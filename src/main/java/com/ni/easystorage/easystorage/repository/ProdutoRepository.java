package com.ni.easystorage.easystorage.repository;

import com.ni.easystorage.easystorage.entity.ProdutoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProdutoRepository extends JpaRepository<ProdutoEntity,Long> {

    ProdutoEntity findByEan(String ean);

    ProdutoEntity findByDescricao(String descricao);

}
