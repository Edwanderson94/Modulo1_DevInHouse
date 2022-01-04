package exerciciosMod1_S1_EX3;

public class exec3Metodo1_1 {

	public static void main(String[] args) {
		String saida = "teste>DIEGO<teste>DIEGO<teste";
		String [] novaSaida =  saida.split("<");
		StringBuilder sb = new StringBuilder();
		for(String x: novaSaida){
			sb.append("<");
			if(x.contains(">"))
			{
				sb.append(x.substring(0,x.lastIndexOf(">") + 1));
				sb.append("\n");
				sb.append(x.substring(x.indexOf(">") + 1, x.length()));
				sb.append("\n");
			}
			else
			{
				sb.append(x);
				sb.append(">");
				sb.append("\n");
			}
		}
		System.out.println(sb.toString());
		
	}
	
}
