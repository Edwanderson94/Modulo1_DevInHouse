package devinmoney.contas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import devinmoney.agencias.Agencia;

public class DadosConta {
	
	protected String nome;
	protected String cpf;
	protected Agencia agencia;
	protected Double renda;
	private Double saldo;
	private static Integer numeroConta;
	
//	Método contrutor das Contas
	public DadosConta(String nome, 	String cpf, Agencia agencia, Double renda, Double saldo) {
		this.nome = nome;
		this.cpf = cpf;
		this.agencia = agencia;
		this.renda = renda;
		this.saldo = 0.0;
//		numeroConta++;
	}

//	Método de operação de deposito nas contas:
	public void deposito (Double valor) {
		this.saldo += valor;
		System.out.printf("Deposito realizado no valor R$ %.2f %n", valor);
	}
		
//	Método de operação de verificação de CPF:
	public String validaCPF(String cpf) {
		
		List<Long> cpfInteiro = new ArrayList<Long>();
		Long numeroUm = (long) 10;
		Long numeroDois = (long) 11;
				
//		Criando um Arraylist (String):
		List<String> listaCPF = new ArrayList<String>();
		
//		Listando o CPF através do Array criado acima:
		listaCPF = Arrays.asList(cpf);
		
//		Percorre cada numero do CPF em forma de letra
		for(String s: listaCPF){
			
//				Convertendo os dados do CPF de String para LONG:
				Long i = Long.parseLong(s);
				
//				Adicionando na lista cpfInteiro a variavel i
				cpfInteiro.add(i);
			}
		
		Long somaUm = (long) 0;
	
//		Calculando o primeiro digitCalculo do Primeiro Digito do CPF
		while (numeroUm >= 2) { 
			
//			Calculo do primeiro numero, decrementando de 2 a 10.
			for (Long i:cpfInteiro) {
				Long calcCPF = i*numeroUm;
				somaUm += calcCPF;
				numeroUm --;
			}	
		}
	
		Integer restoPrimeiro = 0;
		Integer primeiroDigito = 0;
		
		if (somaUm % 11 == 0 || somaUm % 11 == 1) {
			primeiroDigito = 0;
		} else if (somaUm % 11 <= 10 || somaUm % 11 >= 2){
			primeiroDigito = restoPrimeiro;
		}
		
		Long somaDois = (long) 0;
		
//		Calculo do Segundo Digito do CPF
		while (numeroDois >= 2) { 
			
//			Calculo do primeiro numero, decrementando de 2 a 10.
			for (Long i:cpfInteiro) {
				Long calcCPF = i*numeroDois;
				somaDois += calcCPF;
				numeroDois --;
			}	
		}
	
		Integer restoSegundo = 0;
		Integer segundoDigito = 0;
		
		if (somaDois % 11 == 0 || somaDois % 11 == 1) {
			segundoDigito = 0;
		} else if (somaDois % 11 <= 10 || somaDois % 11 >= 2){
			segundoDigito = restoSegundo;
		}
		return "Primeiro Digito " + primeiroDigito + " Segundo Digito " + segundoDigito;
	}
	
//	Gets e Setters da Conta
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getNumeroConta() {
		return numeroConta;
	}

	

	public String getCpf() {
		return cpf;
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	public Double getRenda() {
		return renda;
	}

	public void setRenda(Double renda) {
		this.renda = renda;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

//	Método para imprimir na tela os dados da conta
	@Override
	public String toString() {
		return "DadosConta [nome=" + nome + ", cpf=" + cpf + ", agencia=" + agencia + ", renda=" + renda + ", saldo="
				+ saldo + "]";
	} 	
}
	