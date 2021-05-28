package exercicios;

public class Correntista {
    private String codigo;
    private String nome;
    private String email;
    private String telefone;

    //construtor

      public Correntista (String codigo, String nome, String email, String telefone){
        this.setCodigo(codigo);
        this.setNome(nome);
        this.setEmail(email);
        this.setTelefone(telefone);
    }

    //set e get

    public void setCodigo(String codigo) {
          if(codigo.length() <4){
              throw new IllegalArgumentException("Codigo invalido.");
          }
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        if(nome.length() <2){
            throw new IllegalArgumentException("Nome invalido.");
        }
        this.nome = nome;
    }

    public void setEmail(String email) {
        if(email.length() <7){
            throw new IllegalArgumentException("E-mail invalido.");
        }
        this.email = email;
    }

    public void setTelefone(String telefone) {
        if(telefone.length() <8){
            throw new IllegalArgumentException("Telefone invalido.");
        }
        this.telefone = telefone;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }
}
