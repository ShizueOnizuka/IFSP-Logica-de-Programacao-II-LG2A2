package exercicios;

public class Retangulo {
    public Double base;
    public Double altura;

    public Double getAltura() {
        return altura;
    }

    public Double getBase() {
        return base;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double calcularArea(){
        return base * altura;
    }

    public Double calcularPerimetro(){
        return (2 * base) + (2 * altura);
    }
}