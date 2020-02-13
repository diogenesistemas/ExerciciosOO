package exercicio01;

public class Exercicio01 {



    public static void main(String[] args) {
        Mutante vanda = new Mutante("Feiticeira Escarlate", "Magia", true);
        Mutante erik = new Mutante("Magneto", "Magnetismo", false);
        Mutante scott = new Mutante("Ciclope", "Olhos Laser", true);

        erik.atacar();
        vanda.defender();
        scott.atacar();
    }


}
