package exercicio03;

public class Livro {
    private String titulo;
    private String autor;
    private Integer numeroDePaginas;


    public Livro(String titulo, String autor, Integer numeroDePaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Integer getNumeroDePaginas() {
        return numeroDePaginas;
    }
}
