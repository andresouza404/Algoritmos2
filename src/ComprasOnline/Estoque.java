package ComprasOnline;

public class Estoque {
	private Produto[] produtos = new Produto[10];
	
	public Estoque() {
		produtos[0] = new Livro("Senhor dos Anéis", "senhor", 120.00);
		produtos[1] = new Livro("Algorithms", "algorithms", 427.00);
		produtos[2] = new Livro("O Pequeno Príncipe","principe",10.00);
		produtos[3] = new Camiseta("Azul", 5, "azul", 10.00);
		produtos[4] = new Camiseta("Vermelha", 4, "vermelha", 15.00);
		produtos[5] = new Camiseta("Preta", 8, "preta", 12.00);
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
}
