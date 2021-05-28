package exercicios;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CorrentistaTeste {
    private Correntista c1;

    @BeforeEach
    public void beforeEach() {
        c1 = new Correntista();
    }

    @AfterEach
    public void afterEach() {
        c1 = null;
    }

    @Test
    public void criarObjetoCorrentista() {
        assertNotNull(c1);
    }

    @Test
    public void atributoNome() {
        c1.nome = "Bilbo";
        assertNotNull(c1.nome);
    }

    @Test
    public void atributoEmail() {
        c1.email = "bilbo@email.com";
        assertNotNull(c1.email);
    }

    @Test
    public void atributoTelefone() {
        c1.telefone = "29512493";
        assertNotNull(c1.telefone);
    }

    @Test
    public void atributoCodigo() {
        c1.codigo = "1252";
        assertNotNull(c1.codigo);
    }
    //set -------------------------*
    @Test
    public void metodoSetNome() {
        c1.nome = "Bilbo";
        c1.setNome("Bella");
        assertEquals("Bella", c1.nome);
    }
    @Test
    public void metodoSetEmail() {
        c1.email = "Bilbo";
        c1.setEmail("bella@email.com");
        assertEquals("bella@email.com", c1.email);
    }
    @Test
    public void metodoSetTelefone() {
        c1.telefone = "29512493";
        c1.setTelefone("39654948");
        assertEquals("39654948", c1.telefone);
    }
    @Test
    public void metodoSetCodigo() {
        c1.codigo = "1252";
        c1.setCodigo("0610");
        assertEquals("0610", c1.codigo);
    }
    //get ----------------*
    @Test
    public void metodoGetNome() {
        c1.nome = "Bilbo";
        assertEquals("Bilbo", c1.getNome());
    }
    @Test
    public void metodoGetEmail() {
        c1.email = "bilbo@email.com";
        assertEquals("bilbo@email.com", c1.getEmail());
    }
    @Test
    public void metodoGetTelefone() {
        c1.telefone = "29512493";
        assertEquals("29512493", c1.getTelefone());
    }
    @Test
    public void metodoGetCodigo() {
        c1.codigo = "1252";
        assertEquals("1252", c1.getCodigo());
    }


}

