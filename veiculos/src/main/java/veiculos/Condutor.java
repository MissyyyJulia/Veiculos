package veiculos;

import java.util.ArrayList;
import java.util.List;

public class Condutor {

    private String nome;
    private String cpf;
    private List<Veiculo> veiculos;

    public Condutor(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.veiculos = new ArrayList<>();
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public void adicionarVeiculo(Veiculo veiculo) {
        veiculos.add(veiculo);
    }

    public void exibirVeiculos() {
        System.out.println("Condutor: " + nome + " (CPF: " + cpf + ")");
        for (Veiculo v : veiculos) {
            v.exibirDetalhes(); // Polimorfismo em ação
        }
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }
}
