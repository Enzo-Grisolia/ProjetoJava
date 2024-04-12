import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) {
		String nome = "Enzo Grisolia de Souza";
		String tipoConta = "Corrente";
		double saldo = 8750;
		int numeroDigitado= 0;
	
		
		
		System.out.println("*************************");
		System.out.println("\nOlá " + nome);
		System.out.println("Conta " + tipoConta);
		System.out.println("Saldo disponível " + saldo);
		System.out.println("\n*************************");
		
		String menu = """
		--> Digite sua opção <--		
		1- Consultar saldo
		2- Fazer pix
		3- Receber pix
		4- Sair 
		""";
		Scanner in = new Scanner(System.in);
		
		
		while (numeroDigitado != 4) {
			System.out.println(menu);
			numeroDigitado = in.nextInt();
			
			if (numeroDigitado == 1) {
				System.out.println("O saldo atualizado é " + saldo);
			} else if (numeroDigitado == 2) {
				System.out.println("Qual valor deseja transferir?");
				double valor = in.nextDouble();
				if (valor > saldo) {
					System.out.println("Pix negado, saldo insuficiente!");
				} else {
					saldo -= valor;
					System.out.println("Saldo atualizado " + saldo);	
				}
			} else if (numeroDigitado == 3) {
				System.out.println("Valor recebido: ");
				double valor = in.nextDouble();
				saldo += valor;
				System.out.println("Saldo atualizado " + saldo);
			} else if (numeroDigitado != 4) {
				System.out.println("Opção inválida!");
			}
		}
	}
}
