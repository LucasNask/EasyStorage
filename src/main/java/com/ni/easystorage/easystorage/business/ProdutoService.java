package com.ni.easystorage.easystorage.business;

import com.ni.easystorage.easystorage.mapper.ProdutoEntityMapper;
import com.ni.easystorage.easystorage.model.Produto;
import com.ni.easystorage.easystorage.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> listProduto(){
       return ProdutoEntityMapper.INSTANCE.mapToList(produtoRepository.findAll());
    }

    @Cacheable(cacheNames = "Produto", key = "#ean")
    public Produto getProdutoByEan(String ean){
        return ProdutoEntityMapper.INSTANCE.entityToDTO(produtoRepository.findByEan(ean));
    }

    public void saveProduto(final Produto produto){
        produtoRepository.save(ProdutoEntityMapper.INSTANCE.DTOToEntity(produto));
    }

}
