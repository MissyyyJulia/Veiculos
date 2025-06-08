package veiculos;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        ArrayList<Condutor> condutores = new ArrayList<>();
	        boolean executando = true;

	        while (executando) {
	            System.out.println("\n--- MENU ---");
	            System.out.println("1. Cadastrar condutor");
	            System.out.println("2. Adicionar veículo a um condutor");
	            System.out.println("3. Exibir todos os condutores e seus veículos");
	            System.out.println("4. Sair");
	            System.out.print("Escolha uma opção: ");
	            int opcao = scanner.nextInt();
	            scanner.nextLine();

	            switch (opcao) {
	                case 1:
	                    System.out.print("Nome do condutor: ");
	                    String nome = scanner.nextLine();
	                    System.out.print("CPF do condutor: ");
	                    String cpf = scanner.nextLine();
	                    Condutor condutor = new Condutor(nome, cpf);
	                    condutores.add(condutor);
	                    System.out.println("Condutor cadastrado com sucesso!");
	                    break;

	                case 2:
	                    if (condutores.isEmpty()) {
	                        System.out.println("Nenhum condutor cadastrado.");
	                        break;
	                    }

	                    System.out.println("Escolha o condutor:");
	                    for (int i = 0; i < condutores.size(); i++) {
	                        System.out.println(i + " - " + condutores.get(i).getNome());
	                    }
	                    int indice = scanner.nextInt();
	                    scanner.nextLine();

	                    Condutor c = condutores.get(indice);

	                    System.out.println("Tipo do veículo: 1 - Carro | 2 - Moto");
	                    int tipo = scanner.nextInt();
	                    scanner.nextLine();

	                    System.out.print("Placa: ");
	                    String placa = scanner.nextLine();
	                    System.out.print("Modelo: ");
	                    String modelo = scanner.nextLine();
	                    System.out.print("Marca: ");
	                    String marca = scanner.nextLine();
	                    System.out.print("Ano: ");
	                    int ano = scanner.nextInt();
	                    scanner.nextLine();

	                    if (tipo == 1) {
	                        System.out.print("Número de portas: ");
	                        int portas = scanner.nextInt();
	                        System.out.print("Tem ar-condicionado (true/false): ");
	                        boolean ar = scanner.nextBoolean();
	                        scanner.nextLine();
	                        Veiculo carro = new Carro(placa, modelo, marca, ano, portas, ar);
	                        c.adicionarVeiculo(carro);
	                    } else if (tipo == 2) {
	                        System.out.print("Cilindradas: ");
	                        int cilindradas = scanner.nextInt();
	                        scanner.nextLine();
	                        Veiculo moto = new Moto(placa, modelo, marca, ano, cilindradas);
	                        c.adicionarVeiculo(moto);
	                    } else {
	                        System.out.println("Tipo inválido.");
	                    }

	                    System.out.println("Veículo adicionado com sucesso!");
	                    break;

	                case 3:
	                    for (Condutor cond : condutores) {
	                        cond.exibirVeiculos();
	                        System.out.println();
	                    }
	                    break;

	                case 4:
	                    executando = false;
	                    System.out.println("Encerrando...");
	                    break;

	                default:
	                    System.out.println("Opção inválida.");
	            }
	        }

	        scanner.close();
	    }
	}

