package exercicio01;

import java.util.ArrayList;
import java.util.List;

public class Mutante {
    private String nome;
    private String poder;
    private Boolean isHeroi;

    public Mutante (){

    }

    public Mutante(String nome, String poder, Boolean isHeroi) {
        this.nome = nome;
        this.poder = poder;
        this.isHeroi = isHeroi;
    }

    public void atacar(){
        String modelo = "%s está atacando com seu poder de %s%n";
        System.out.printf(modelo, this.nome, this.poder);
    }

    public void defender(){
        String modelo = "%s está se defendendo com seu poder de %s%n";
        System.out.printf(modelo, this.nome, this.poder);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getHeroi() {
        return isHeroi;
    }

    public void setHeroi(Boolean heroi) {
        isHeroi = heroi;
    }
}
