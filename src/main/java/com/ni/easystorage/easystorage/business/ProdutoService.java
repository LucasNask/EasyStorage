package com.ni.easystorage.easystorage.business;

import com.ni.easystorage.easystorage.mapper.ProdutoEntityMapper;
import com.ni.easystorage.easystorage.mapper.ProdutoMapper;
import com.ni.easystorage.easystorage.model.Produto;
import com.ni.easystorage.easystorage.repository.ProdutoRepository;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> listProduto(){
        return ProdutoMapper.INSTANCE.mapFrom(produtoRepository.findAll());
    }

    @Cacheable(value = "ean", key = "#ean")
    public Produto findByEan(String ean){
        return ProdutoMapper.INSTANCE.mapFrom(produtoRepository.findByEan(ean));
    }

    public void saveProduto(final Produto produto){
        produtoRepository.save(ProdutoEntityMapper.INSTANCE.mapFrom(produto));
    }

}
