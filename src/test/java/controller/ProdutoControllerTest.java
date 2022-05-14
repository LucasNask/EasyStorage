package controller;

import com.ni.easystorage.easystorage.business.ProdutoService;
import com.ni.easystorage.easystorage.controller.ProdutoController;
import com.ni.easystorage.easystorage.model.Produto;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;


@ExtendWith(MockitoExtension.class)
public class ProdutoControllerTest {

    @InjectMocks
    ProdutoController produtoController;

    @InjectMocks
    ProdutoService produtoService;

    @Autowired
    MockMvc mockMvc;

    @Test
    public void okLista() throws Exception {
        this.mockMvc.perform(get("/produto")).andReturn();
    }



/*    @Autowired
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
        return produtoService.findByEan(ean);
    }*/

}
