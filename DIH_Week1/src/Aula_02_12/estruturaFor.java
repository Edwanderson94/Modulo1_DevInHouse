package Aula_02_12;

public class estruturaFor {

	public static void main(String[] args) {
		
//		int x = 10;
		
		for (int x = 10; x < 20; x ++) {
			for (int y = 15; y > 10; y--) {
				System.out.println("Valor de Y =" + y);
				if (y == 13) {
					break;
				}
			}
			System.out.println("Valor de X =" + x);
		
//		Executando o for com if utilizando continue e break
//		for (int x = 10;; x++) {
//			if (x == 11) {
//				continue;
//			} else if (x == 15) {
//				break;
//			}
//			System.out.println(x);
			
//		Não executa porque x é 10
//		for (int x = 10;x < 10; x++) {
//			System.out.println("x =" + x);
		
//		Looping Infinito 2
//		for (;x >= 10; x++) {
//			System.out.println("x = " + x);
		
//		Cálculo com for até 10
//		for (;i < 10; i = (i * 3) + 1) {
//			System.out.println("i = " + i);

//		Looping infinito 1
//		for (;;) {
//			System.out.println("Oi");
		}

	}

}
