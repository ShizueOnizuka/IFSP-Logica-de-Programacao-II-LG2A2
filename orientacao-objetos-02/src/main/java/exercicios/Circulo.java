package exercicios;

public class Circulo {
    public Double raio;

    public Double getRaio(){
//.
        return raio;
    }
    public void setRaio(Double raio) {

        this.raio = raio;
    }
    public Double calcularArea(){

        return 3.14 * (raio *raio);
    }
    public Double calcularPerimetro(){

        return 2 * raio * 3.14;
    }
}
