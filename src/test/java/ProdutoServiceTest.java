import org.junit.Test;
import static org.junit.Assert.*;
import com.mycompany.skateonline1.Produto;
import com.mycompany.skateonline1.ProdutoService;

public class ProdutoServiceTest {

    @Test
    public void deveValidarProdutoCorreto() {

        Produto produto =
                new Produto(
                        "Shape Maple",
                        199.90,
                        10
                );

        ProdutoService service =
                new ProdutoService();

        assertTrue(
                service.validarProduto(produto)
        );
    }
}