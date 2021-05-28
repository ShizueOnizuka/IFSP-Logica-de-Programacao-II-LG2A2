package exercicios;

import exercicios.Circulo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CirculoTeste {
    @Test
    public void criarObjetoCirculo(){
        Circulo q1 = new Circulo();
        assertNotNull(q1);
    }
    @Test
    public void presencaAtributoPi(){
        Circulo q1 = new Circulo();
        q1.pi = 3.14;
        assertNotNull(q1.pi);
    }
    @Test
    public void presencaAtributoRaio(){
        Circulo q1 = new Circulo();
        q1.raio = 10.0;
        assertNotNull(q1.raio);
    }
    @Test
    public void metodoCalcularArea(){
        Circulo q1 = new Circulo();
        q1.pi = 3.14;
        q1.raio = 10.0;
        Double valorEsperado = 314.0;
        Double valorObtido = q1.calcularArea();
        assertEquals(valorEsperado, valorObtido);
    }
    @Test
    public  void metodoCalcularPerimetro(){
        Circulo q1 = new Circulo();
        q1.pi = 3.14;
        q1.raio = 2.0;
        Double valorEsperado = 12.56;
        Double valorObtido = q1.calcularPerimetro();
        assertEquals(valorEsperado, valorObtido);
    }
}

