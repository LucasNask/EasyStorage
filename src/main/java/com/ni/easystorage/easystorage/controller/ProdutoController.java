package com.ni.easystorage.easystorage.controller;

import com.ni.easystorage.easystorage.entity.ProdutoEntity;
import com.ni.easystorage.easystorage.mapper.ProdutoEntityMapper;
import com.ni.easystorage.easystorage.model.Produto;
import com.ni.easystorage.easystorage.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@RestController
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @RequestMapping("/Produtos")
    public List<Produto> lista(String ean){
        if(Objects.nonNull(ean)){
            List<ProdutoEntity> produtos = produtoRepository.findAll();
            return ProdutoEntityMapper.INSTANCE.mapToList(produtos);
        }else{
            ProdutoEntity produto = produtoRepository.findByEan(ean);
            List<ProdutoEntity> produtos = new ArrayList<ProdutoEntity>();
            produtos.add(produto);
            return ProdutoEntityMapper.INSTANCE.mapToList(produtos);
        }
    }

}
