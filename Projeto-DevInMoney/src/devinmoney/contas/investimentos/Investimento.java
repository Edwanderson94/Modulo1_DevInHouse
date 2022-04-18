package devinmoney.contas.investimentos;

import devinmoney.agencias.Agencia;
import devinmoney.contas.ContaInvestimento;

public class Investimento extends ContaInvestimento {
	
	private Double taxa;

	public Investimento(String nome, String cpf, Agencia agencia, Double renda, Double saldo, Double valorInvestido,
			Double taxa) {
		super(nome, cpf, agencia, renda, saldo, valorInvestido);
		this.setTaxa(taxa);
	}

	public Double getTaxa() {
		return taxa;
	}

	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}
	
//	Investimento Cripto Moeda
	public String criptoMoeda () {
		taxa = 10.0 / 100.0;
		Double simulacao = valorInvestido * taxa;
		return "Valor a resgatar investindo pela Cripto Moeda" + simulacao;
	}
	
//	Investimento Fundo Imobiliario
	public String fundoImob () {
		taxa = 2.0 / 100.0;
		Double simulacao = valorInvestido * taxa;
		return "Valor a resgatar investindo pela Fundo Imobiliario" + simulacao;
	}
	
//	Investimento Renda Fixa
	public String rendaFixa () {
		taxa = 5.0 / 100.0;
		Double simulacao = valorInvestido * taxa;
		return "Valor a resgatar investindo pela Renda Fixa" + simulacao;
	}
	
}