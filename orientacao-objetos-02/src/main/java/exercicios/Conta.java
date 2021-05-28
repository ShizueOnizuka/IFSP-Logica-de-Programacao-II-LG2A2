package exercicios;

public class Conta {
    public Integer numero = 0;
    public Double saldo = 0.0;
    public Double limite = 0.0;

    //get
    public Integer getNumero() {
        return numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Double getLimite() {
        return limite;
    }
    //set

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void setSaldo(Double saldo) {

        this.saldo = saldo;
    }

    public void setLimite(Double limite) {
        this.limite = limite;
    }
    //-------------------

    public void depositar(Double valor) {
        if(valor <= 0){
            throw new IllegalArgumentException("Valor deve ser maior que zero.");
        }
        saldo = saldo + valor;
    }

    public void sacar(Double valor) {
        //caso o valor seja abaixo de zero
        if(valor <= 0){
            throw new IllegalArgumentException("Valor deve ser maior que zero.");
        }
        //caso não exista limite disponivel
        else if (saldo + limite < valor) {
            throw new IllegalArgumentException("Limite indisponível.");
        }

        saldo = saldo - valor;
    }

    public void transferir(Conta conta, Double valor) {

        //caso o valor seja abaixo de zero
        if(valor <= 0){
            throw new IllegalArgumentException("Valor deve ser maior que zero.");
        }
        //caso não exista limite disponivel
        else if (saldo + limite < valor) {
            throw new IllegalArgumentException("Limite indisponível.");
        }
        saldo = saldo - valor;
        conta.saldo = conta.saldo + valor;
    }


}
