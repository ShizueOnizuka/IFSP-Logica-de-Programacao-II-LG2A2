package exercicios;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class QuadradoTeste {
    private Quadrado q1;

    @BeforeEach
    public void beforeEach(){
        q1 = new Quadrado();
    }
    @AfterEach
    public void afterEach(){
        q1 = null;
    }
    @Test
    public void criarObjetoQuadrado(){
        assertNotNull(q1);
    }
    @Test
    public void presencaAtributos(){
        q1.lado = 10.0;
        assertNotNull(q1.lado);
    }
    @Test
    public void metodoSetQuadrado(){
        q1.lado = 10.0;
        q1.setLado(20.0);
        assertEquals(20.0 , q1.lado);

    }
    @Test
    public void metodoGetQuadrado(){
        q1.lado = 10.0;
        assertEquals(10.0,q1.getLado());

    }
    @Test
    public void metodoCalcularArea(){
        q1.lado = 10.0;
        Double esperado = 100.0;
        Double obtido = q1.calcularArea();
        assertEquals(esperado, obtido);

    }
    @Test
    public void metodoCalcularPerimetro(){
        q1.lado = 10.0;
        Double esperado = 40.0;
        Double obtido = q1.calcularPerimetro();
        assertEquals(esperado, obtido);

    }
}

