package br.com.collectionsExercicios;

import java.util.ArrayList;


public class TestaEstoque {

	public static void main(String[] args) {
		
		Estoque e1 = new Estoque("Peças automotivas. | ", 80);
		Estoque e2 = new Estoque("Produtos internacionais. | ", 30);
		Estoque e3 = new Estoque("Produtos de carga. | ", 150);
		Estoque e4 = new Estoque("Produtos de peças. |", 200);
		
		ArrayList<Estoque> produtos = new ArrayList<>();
		
		produtos.add(e1);
		produtos.add(e2);
		produtos.add(e3);
		produtos.add(e4);
		
		
		produtos.remove(0);
		
		
		for(Estoque i : produtos) {
			System.out.println(i);
		}
		
		
		
	
	}
	

}
