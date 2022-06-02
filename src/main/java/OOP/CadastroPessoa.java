package OOP;

class PessoaAbstrata{
    String cpf, nome;
    Integer idade;

    public PessoaAbstrata(){
        this.idade = 0;
        this.cpf = "";
        this.nome = "";
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Integer getIdade() {
        return idade;
    }
    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}

public class CadastroPessoa {
    public static void main(String[] args) {
        PessoaAbstrata nova = new PessoaAbstrata();

        nova.setCpf("999.999.999-99");
        nova.setIdade(20);
        nova.setNome("Gabriel");

        PessoaAbstrata outra = new PessoaAbstrata();

        outra.setCpf("999.999.999-99");
        outra.setIdade(19);
        outra.setNome("Giulia");

        System.out.println("Pessoa 1 = Nome: " + nova.getNome());
        System.out.println("Pessoa 1 = CPF: " + nova.getCpf());
        System.out.println("Pessoa 1 = Idade: " + nova.getIdade());
        System.out.println("\n\nPessoa 2 = Nome: " + outra.getNome());
        System.out.println("Pessoa 2 = CPF: " + outra.getCpf());
        System.out.println("Pessoa 2 = Idade: " + outra.getIdade());
    }
}