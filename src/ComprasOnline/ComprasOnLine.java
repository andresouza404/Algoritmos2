package ComprasOnline;

public class ComprasOnLine {

	public static void main(String[] args) {
		Produto p1 = new Livro("Senhor dos Anéis", 120.00);
		Produto p2 = new Livro("Algorithms", 427.00);
		Produto p3 = new Livro("O Pequeno Príncipe", 10.00);
		Produto p4 = new Camiseta("Azul", 5, 10.00);
		Produto p5 = new Camiseta("Vermelha", 4, 15.00);
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		Produto produto = null;
		
		while (true) {
			Console.println("Qual produto deseja?");
			String escolha = Console.readString();
			
			if (escolha.equalsIgnoreCase("sair"))
				break;
			
			switch (escolha) {
				case "senhor": produto = p1; break;
				case "algorithms": produto = p2; break;
				case "principe": produto = p3; break;
				case "azul": produto = p4; break;
				case "vermelha": produto = p5; break;
			}

			carrinho.addItem(escolha, produto);	
		}

		Console.println("Total da compra: " + carrinho.getTotal()
		);
	}

}
