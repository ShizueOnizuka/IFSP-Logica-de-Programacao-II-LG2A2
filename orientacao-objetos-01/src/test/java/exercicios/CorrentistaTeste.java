package exercicios;

import exercicios.Correntista;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CorrentistaTeste {
    @Test
    public void criarObjetoCorrentista(){
        Correntista c1 = new Correntista();
        assertNotNull(c1);
    }
    @Test
    public void presencaAtributoNome(){
        Correntista c1 = new Correntista();
        c1.nome = "Bilbo";
        assertNotNull(c1.nome);

    }
    @Test
    public void presencaAtributoCodigo(){
        Correntista c1 = new Correntista();
        c1.codigo =01;
        assertNotNull(c1.codigo);
    }
    @Test
    public void presencaAtributoEmail(){
        Correntista c1 = new Correntista();
        c1.email ="bilbobao@gmail.com";
        assertNotNull(c1.email);
    }
    @Test
    public void presencaAtributoTelefone(){
        Correntista c1 = new Correntista();
        c1.telefone ="11 29512493";
        assertNotNull(c1.telefone);
    }



}
