package ComprasOnline.app;

import ComprasOnline.app.interfaces.Publisher;
import ComprasOnline.app.interfaces.Subscriber;
import ComprasOnline.produtos.Camiseta;
import ComprasOnline.produtos.Livro;
import ComprasOnline.produtos.Produto;
import ComprasOnline.view.Console;
import datastructures.Vetor;

public final class Estoque implements Subscriber {
	private Vetor<Produto> produtos = new Vetor<>();
	
	private static Estoque singleInstance;
	public static Estoque instance() {
		if (singleInstance == null) {
			singleInstance = new Estoque();

			singleInstance.addProduct(
						new Livro("Senhor dos Anéis", "senhor", 120.00)
					);
			singleInstance.addProduct(
						new Livro("Algorithms", "algorithms", 427.00)
					);
			singleInstance.addProduct(
						new Livro("O Pequeno Príncipe","principe",10.00)
					);
			singleInstance.addProduct(
						new Camiseta("Azul", 5, "azul", 10.00)
					);
			singleInstance.addProduct(
						new Camiseta("Vermelha", 4, "vermelha", 15.00)
					);
			singleInstance.addProduct(
					new Camiseta("Preta", 8, "preta", 12.00)
				);
			singleInstance.addProduct(
					new Livro("O Alquimista", "alquimista", 55.00)
				);

		}
		return singleInstance;
	}
	
	private Estoque() {}

	public void setNotifier(Publisher publisher) {
		publisher.subscribe(this);
	}

	private void addProduct(Produto produto) {
		if (produto instanceof Camiseta) {
			produtos.append(produto);
		}
		if (produto instanceof Livro) {
			produtos.insert(0, produto);
		}
	}
	
	public Produto search(String key) {
		for (Produto p : produtos) {
			if (p != null) {
				if (p.getSku().equalsIgnoreCase(key))
					return p;
			}
		}
		return null;
	}

	public int getNumberOfProducts() {
		return produtos.getSize();
	}

	public Produto getProduct(int i) {
		return produtos.get(i);
	}

	@Override
	public void eventOcurred(Object sender) {
		for (Produto p : produtos) {
			if (p.equals(sender)) {
				Console.println("Vendido: " + p.getSku());
				return;
			}
		}
	}
}
