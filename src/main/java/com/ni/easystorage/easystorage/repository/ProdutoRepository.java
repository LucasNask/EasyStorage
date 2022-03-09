package com.ni.easystorage.easystorage.repository;

import com.ni.easystorage.easystorage.entity.ProdutoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProdutoRepository extends JpaRepository<ProdutoEntity,Long> {

    ProdutoEntity findByEan(String ean);

    ProdutoEntity findByDescricao(String descricao);

}
