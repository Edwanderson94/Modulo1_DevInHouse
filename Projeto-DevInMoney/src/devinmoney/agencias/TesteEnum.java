package devinmoney.agencias;

public class TesteEnum {
	
//	public static void main(String[] args) {
//		for (String p : Agencia.values()) {
//			System.out.println("%s%n", p);
//		}
//	}
	
	Agencia valorEnum;
	TesteEnum (String valorEnum) {
		this.valorEnum = Agencia.valueOf(valorEnum);
		
		
	}
}