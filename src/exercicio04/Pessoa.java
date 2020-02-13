package exercicio04;

public abstract class Pessoa {
    private String nome;
    private Integer idade;
    private String dataDeNascimento;

    public abstract void exibirDados();

    public Pessoa(){

    }

    public Pessoa(String nome, Integer idade, String dataDeNascimento) {
        this.nome = nome;
        this.idade = idade;
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
}
