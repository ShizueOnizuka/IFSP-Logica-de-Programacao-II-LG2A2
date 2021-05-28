package exercicios;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class RetanguloTeste {
    private Retangulo r1;

    @BeforeEach
    public void beforeEach(){
        r1 = new Retangulo();
    }
    @AfterEach
    public void afterEach(){
        r1 = null;
    }
    @Test
    public void criarObjetoRetangulo(){
        assertNotNull(r1);
    }
    @Test
    public void presencaAtributos(){
        r1.altura = 10.0;
        r1.base = 5.0;
        assertNotNull(r1.altura);
        assertNotNull(r1.base);
    }
    @Test
    public void metodoSetRetangulo() {
        r1.altura = 10.0;
        r1.setAltura(20.0);
        assertEquals(20.0, r1.altura);

        r1.base = 10.0;
        r1.setBase(20.0);
        assertEquals(20.0,r1.base);
    }
    @Test
    public void metodoGetRetangulo(){
        r1.altura = 10.0;
        assertEquals(10.0, r1.getAltura());

        r1.base = 10.0;
        assertEquals(10.0, r1.getBase());

    }
    @Test
    public void metodoCalcularArea(){
        r1.base = 10.0;
        r1.altura = 5.0;
        Double esperado = 50.0;
        Double obtido = r1.calcularArea();
        assertEquals(esperado,obtido);

    }
    @Test
    public void metodoCalcularPerimetro(){
        r1.base = 50.0;
        r1.altura = 10.0;
        Double esperado = 120.0;
        Double obtido = r1.calcularPerimetro();
        assertEquals(esperado, obtido);
    }
}
