package exercicios;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class FuncionarioTeste {
    @Test
    public void criarFuncionario(){
        Funcionario f1 = new Funcionario();
        assertNotNull(f1);
    }
    @Test
    public void presencaAtributos(){
        Funcionario f1 = new Funcionario();
        f1.nome ="Bilbo";
        f1.email ="bilbobao@gmail.com";
        f1.idade = 4;
        f1.salario = 3000.0;
        assertNotNull(f1.nome);
        assertNotNull(f1.email);
        assertNotNull(f1.idade);
        assertNotNull(f1.salario);
    }
    @Test
    public void metodoObterDados(){
        Funcionario f1 = new Funcionario();
        f1.nome ="Joao da Silva";
        f1.email ="joao@email.com";
        f1.idade = 22;
        String valorEsperado = "Joao da Silva, 22 anos (joao@email.com)";
        String valorObtido = f1.obterDados();
        assertEquals(valorEsperado, valorObtido);

    }
    @Test
    public void metodoPromover() {
        Funcionario f1 = new Funcionario();
        f1.salario = 3000.0;
        Double esperado = 3300.0;
        f1.promover(10.0);
        Double obtido = f1.salario;
        assertEquals(esperado, obtido);
    }

}
