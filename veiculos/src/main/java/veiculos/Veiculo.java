package veiculos;

//classe pai
public class Veiculo {
     String placa;
     String modelo;
     String marca;
     int ano;

    //construtor
    public Veiculo(String placa, String modelo, String marca, int ano) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
    }

    //getters e setters (encapsulamento)
    public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	//exibe detalhes do veículo
    public void exibirDetalhes() {
        System.out.println("Veículo - Modelo: " + modelo + ", Marca: " + marca + ", Placa: " + placa + ", Ano: " + ano);
    }

  
    
}