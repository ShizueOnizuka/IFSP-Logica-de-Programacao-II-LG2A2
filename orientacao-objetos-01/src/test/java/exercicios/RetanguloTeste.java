package exercicios;

import exercicios.Retangulo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class RetanguloTeste {
    @Test
    public void criarObjetoRetangulo(){
        Retangulo q1 = new Retangulo();
        assertNotNull(q1);
    }
    @Test
    public void presencaAtributoBase(){
        Retangulo q1 = new Retangulo();
        q1.base = 10.0;
        assertNotNull(q1.base);
    }
    @Test
    public void presencaAtributosAltura(){
        Retangulo q1 = new Retangulo();
        q1.altura = 5.0;
        assertNotNull(q1.altura);
    }
    @Test
    public void metodoCalcularArea(){
        Retangulo q1 = new Retangulo();
        q1.altura = 5.0;
        q1.base = 10.0;
        Double valorEsperado = 50.0;
        Double valorObtido = q1.calcularArea();
        assertEquals(valorEsperado, valorObtido);
    }
    @Test
    public void metodoCalcularPerimetro(){
        Retangulo q1 = new Retangulo();
        q1.altura = 10.0;
        q1.base = 50.0;
        Double valorEsperado = 120.0;
        Double valorObtido = q1.calcularPerimetro();
        assertEquals(valorEsperado, valorObtido);
    }
}
