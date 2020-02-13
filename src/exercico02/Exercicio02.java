package exercico02;

public class Exercicio02 {
    public static void main(String[] args) {
        Triangulo triangulo1 = new Triangulo(3.0, 7.0);
        Triangulo triangulo2 = new Triangulo(5.0, 5.0);
        Triangulo triangulo3 = new Triangulo(4.0, 3.0);

        System.out.println("A área do triângulo 1 é: "+triangulo1.calculaArea());
        System.out.println("A área do triângulo 2 é: "+triangulo2.calculaArea());
        System.out.println("A área do triângulo 3 é: "+triangulo3.calculaArea());

    }
}
