package br.com.collectionsExercicios;

public class Estoque {
	
	private String produto;
	private int caixa;
	

	public Estoque(String produto, int caixa) {
		super();
		this.produto = produto;
		this.caixa = caixa;
	}

	public String getProduto() {
		return produto;
	}



	public void setProduto(String produto) {
		this.produto = produto;
	}



	public int getCaixa() {
		return caixa;
	}



	public void setCaixa(int caixa) {
		this.caixa = caixa;
	}



	public String toString() {
		return "\nQual produto temos no estoque?: " + this.produto + " Quantas caixas temos no estoque?: " + this.caixa;
	}

}
