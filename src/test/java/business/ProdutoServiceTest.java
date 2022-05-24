package business;

import com.ni.easystorage.easystorage.business.ProdutoService;
import com.ni.easystorage.easystorage.entity.ProdutoEntity;
import com.ni.easystorage.easystorage.model.Produto;
import com.ni.easystorage.easystorage.repository.ProdutoRepository;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(MockitoExtension.class)
public class ProdutoServiceTest {

    @Mock
    private ProdutoRepository repository;

    @InjectMocks
    private ProdutoService produtoService;

    @Captor
    private ArgumentCaptor<ProdutoEntity> captorEntity;

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void okListProduto(){
        Mockito.when(repository.findAll()).thenReturn(new ArrayList<ProdutoEntity>());
        List<Produto> result = produtoService.listProduto();
        assertNotNull(result);
    }


    @Test
    public void okSaveProduto(){
        produtoService.saveProduto(Mockito.any(Produto.class));

        Mockito.verify(repository, Mockito.times(1))
                .save(captorEntity.capture());
    }

    @Test
    public void okfindyByEan(){
        Mockito.when(repository.findByEan(Mockito.anyString()))
                .thenReturn(new ProdutoEntity());

        final Produto result = produtoService.findByEan(Mockito.anyString());

        assertNotNull(result);
    }

}
