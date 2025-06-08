package veiculos;

//Herda atributos de Veiculo
public class Moto extends Veiculo{

	 private int cilindradas;

	    public Moto(String placa, String modelo, String marca, int ano, int cilindradas) {
	        super(placa, modelo, marca, ano);
	        this.cilindradas = cilindradas;
	    }

	    public int getCilindradas() {
	        return cilindradas;
	    }

	    public void setCilindradas(int cilindradas) {
	        this.cilindradas = cilindradas;
	    }

	    @Override
	    public void exibirDetalhes() {
	        System.out.println("Moto -> " + getMarca() + " " + getModelo() + " (" + getAno() + "), Placa: " + getPlaca());
	        System.out.println("Cilindradas: " + cilindradas + "cc");
	    }
	    
}
