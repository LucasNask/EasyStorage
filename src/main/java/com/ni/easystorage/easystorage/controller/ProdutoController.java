package com.ni.easystorage.easystorage.controller;

import com.ni.easystorage.easystorage.business.ProdutoService;
import com.ni.easystorage.easystorage.entity.ProdutoEntity;
import com.ni.easystorage.easystorage.mapper.ProdutoEntityMapper;
import com.ni.easystorage.easystorage.model.Produto;
import com.ni.easystorage.easystorage.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@RestController
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping("/produto")
    public List<Produto> lista(){
        return produtoService.listProduto();
    }

    @PostMapping("/produto")
    public void cadastroProduto(@RequestBody Produto produto){
        produtoService.saveProduto(produto);
    }

    @GetMapping("/produto/{ean}")
    public Produto retrieveByEan(@PathVariable String ean){
        return produtoService.getProdutoByEan(ean);
    }

}
