package exercicio04;

public class Cliente extends Pessoa{
    private String cpf;

    public Cliente() {
      super();
    }

    public Cliente(String nome, Integer idade, String dataDeNascimento, String cpf) {
        super(nome, idade, dataDeNascimento);
        this.cpf = cpf;
    }

    @Override
    public void exibirDados() {
        System.out.println();

    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
