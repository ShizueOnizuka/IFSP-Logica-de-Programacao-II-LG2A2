package exercicios;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CirculoTeste {
    private Circulo circulo1;

    @BeforeEach
    public void beforeEach() {
        circulo1 = new Circulo(2.0);
    }

    @AfterEach
    public void afterEach() {
        circulo1 = null;
    }

    @DisplayName("Deve criar um objeto circulo")
    public void criarObjetoCirculo() {
        assertNotNull(circulo1);
    }

    @Test
    public void presencaAtributo() {
        assertNotNull(circulo1.getRaio());
    }

    //set
    @Test
    public void metodoSetRaio() {
        circulo1.setRaio(2.0);
        assertEquals(2.0, circulo1.getRaio());
    }

    //set invalido
    @Test
    public void metodoSetRaioInvalido() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> circulo1.setRaio(-5.0));
        assertEquals("O raio deve ser maior que zero.", exception.getMessage());
    }
    //get
    @Test
    public void metodogetRaio(){
        assertEquals(2.0, circulo1.getRaio());

    }
    @Test
    public void metodoCalcularArea(){
        Double esperado =12.56;
        Double obtido =circulo1.calcularArea();
        assertEquals(esperado,obtido);

    }
    @Test
    public void metodoCalcularPerimetro(){
        Double esperado = 12.56;
        Double obtido = circulo1.calcularPerimetro();
        assertEquals(esperado,obtido);
    }
}