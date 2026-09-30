public class Funcionario extends PessoaFisica {
    private int matricula;

    public Funcionario() {}

    public Funcionario(String nome, long cpf, int matricula) {
        super(nome, cpf);
        this.matricula = matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return "Funcionario: nome=" + getNome() + ", cpf=" + getCpf() + ", matricula=" + matricula;
    }
}
