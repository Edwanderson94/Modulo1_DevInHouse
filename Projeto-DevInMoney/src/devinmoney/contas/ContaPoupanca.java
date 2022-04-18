package devinmoney.contas;

import devinmoney.agencias.Agencia;

public class ContaPoupanca extends DadosConta {
	
	private Integer mes;
	private Double taxaAnual;
	private Double valor;
	
//	Construtor de Objetos
	public ContaPoupanca(String nome, String cpf, Agencia agencia, Double renda, Double saldo, Integer mes) {
		super(nome, cpf, agencia, renda, saldo);
		this.mes = mes;
	}

	public Integer getMes() {
		return mes;
	}

	public void setMes(Integer mes) {
		this.mes = mes;
	}

	public Double getTaxaAnual() {
		return taxaAnual;
	}
		
	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	
//	Criar um método para simular a poupança, pegar a renda e calcular a rentabilidade dele.
	public String simulaPoup (Double taxa, Integer meses) {
		this.taxaAnual = taxa;
		Double taxaMensal = (taxaAnual / 12.0) / 100.0;
		Double rendimentoValor = (valor * taxaMensal) * meses;
		return "O valor do rendimento é " + rendimentoValor;
	}
	
	@Override
	public String toString() {
		return "ContaPoupanca [mes=" + mes + ", taxaAnual=" + taxaAnual + ", getNome()=" + getNome() + ", getCpf()="
				+ getCpf() + ", getAgencia()=" + getAgencia() + ", getRenda()=" + getRenda() + ", getSaldo()="
				+ getSaldo() + "]";
	}
}
