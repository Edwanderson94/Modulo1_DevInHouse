package exerciciosMod1_S1_EX9;

import java.util.Scanner;

public class exec9Metodo1 {

	public static void main(String[] args) {
		
		

		Scanner leitorSabor = new Scanner(System.in);

		String saborPizza;
		int quantidadePedacos = 0;

		while (true) {
			
			System.out.println("Digite o número do sabor que você gostaria:\n" + "\n 1- Mussarela" + "\n 2- Calabresa"
					+ "\n 3- Portuguesa");
			
			int escolhaUsuario = leitorSabor.nextInt();
			if (escolhaUsuario >= 1 && escolhaUsuario <= 3) {
				switch (escolhaUsuario) {
				case 1:
					saborPizza = "Calabresa";
					quantidadePedacos++;
					break;
				case 2:
					saborPizza = "Mussarela";
					quantidadePedacos++;
					break;
				case 3:
					saborPizza = "Portuguesa";
					quantidadePedacos++;
					break;
				case 4:
					System.out.println("Esperamos que tenha gostado, obrigado pela preferencia");
					break;
				default:
					saborPizza = "Digite um sabor válido";
					break;
				}
			} else {
				System.out.println("Agradecemos pela Preferência!");
				break;
			}
		}
		leitorSabor.close();
		System.out.println(
				"Você consumiu " + quantidadePedacos + " pedaços de pizza.");
	}
}