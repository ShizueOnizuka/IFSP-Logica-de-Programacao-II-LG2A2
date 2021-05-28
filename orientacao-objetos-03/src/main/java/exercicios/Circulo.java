package exercicios;

public class Circulo {
    private Double raio;

    //Construtor
    public Circulo(Double raio){
        this.setRaio(raio);
    }
    //set e get
    public void setRaio(Double raio) {
        if (raio <=0){
            throw new IllegalArgumentException("O raio deve ser maior que zero.");
        }
        this.raio = raio;
    }

    public Double getRaio() {
        return raio;
    }

    public Double calcularArea(){

        return 3.14 * (raio * raio);
    }
    public Double calcularPerimetro(){

        return  2 * raio * 3.14;
    }
}
