package exercico02;

public class Triangulo {

    private Double base;
    private Double altura;

    public Triangulo(){

    }
    public Triangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Double calculaArea(){
        Double area = (this.base * this.altura)/2;
        return area;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }
}
