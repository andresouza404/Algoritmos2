package datastructures.test;

import datastructures.ListaEncadeada;

public class TestaLista {

	public static void main(String[] args) {
		ListaEncadeada<String> lista = new ListaEncadeada<>();
		
		lista.append("Cerveja");
		lista.append("Amendoim");
		lista.append("P�o de Queijo");
		lista.append("Mais Cerveja");
		lista.append("Coca-Cola");
		lista.append("P�o");
		lista.append("Queijo");
		lista.append("Presunto");
		
		lista.print();
	}

}
