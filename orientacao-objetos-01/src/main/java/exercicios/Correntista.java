package exercicios;

public class Correntista {
    public Integer codigo;
    public String nome;
    public String email;
    public String telefone;

    public String getNomeEmail() {
        return nome + " " + email;
    }
}
