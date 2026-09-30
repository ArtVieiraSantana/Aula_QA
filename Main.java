public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Maria");
        PessoaFisica pf = new PessoaFisica("João", 12345678900L);
        PessoaJuridica pj = new PessoaJuridica("Empresa X", 9876543210001L);
        Funcionario funcionario = new Funcionario("Ana", 11122233344L, 1001);

        System.out.println(pessoa);
        System.out.println(pf);
        System.out.println(pj);
        System.out.println(funcionario);
    }
}
