package exerciciosMod1_S1_EX2;

import java.util.Scanner;

public class exec2Metodo2 {

	public static void main(String[] args) {
		
		System.out.println("Digite um n�mero para detalhes do tipo primitivo"
				+ "\n 1 para Int"
				+ "\n 2 para Char"
				+ "\n 3 para Boolean"
				+ "\n 4 para Real");
		
		Scanner leitor = new Scanner(System.in);
		int opcao = leitor.nextInt();
		String detalhe = "";
		
		switch (opcao) {
		case 1:
			detalhe = "qualquer n�mero inteiro, seja ele negativo, nulo ou positivo";
			break;
		case 2:
			detalhe = "qualquer conjunto de caracteres alfanum�ricos";
			break;
		case 3:
			detalhe = "conjunto de valores falso ou verdadeiro";
			break;
		case 4:
			detalhe = "qualquer n�mero real, seja ele negativo, nulo ou positivo";
			break;
		default:
			detalhe = "Inv�lido";
			break;
		}
		leitor.close();

		System.out.println(detalhe);
	}
}
