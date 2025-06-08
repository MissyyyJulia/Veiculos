package veiculos;

//Herda atributos de Veiculo
public class Carro extends Veiculo{
	
	private int qtdPortas;
    private boolean arCondicionado;

    public Carro(String placa, String modelo, String marca, int ano, int qtdPortas, boolean arCondicionado) {
       
    	super(placa, modelo, marca, ano); //vem da classe pai Veiculo
        this.qtdPortas = qtdPortas;
        this.arCondicionado = arCondicionado;
    }

    public int getNumeroDePortas() {
        return qtdPortas;
    }

    public void setNumeroDePortas(int qtdPortas) {
        this.qtdPortas = qtdPortas;
    }

    public boolean temArCondicionado() {
        return arCondicionado;
    }

    public void setArCondicionado(boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Carro -> " + getMarca() + " " + getModelo() + " (" + getAno() + "), Placa: " + getPlaca());
        System.out.println("Número de portas: " + qtdPortas);
        System.out.println("Ar condicionado: " + (arCondicionado ? "Sim" : "Não"));
    }
}
