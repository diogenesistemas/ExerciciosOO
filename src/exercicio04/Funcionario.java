package exercicio04;

public class Funcionario extends Pessoa{
    private String numeroDeMatricula;

    public Funcionario() {
        super();
    }

    public Funcionario(String nome, Integer idade, String dataDeNascimento, String numeroDeMatricula) {
        super(nome, idade, dataDeNascimento);
        this.numeroDeMatricula = numeroDeMatricula;
    }

    @Override
    public void exibirDados() {

    }
}
