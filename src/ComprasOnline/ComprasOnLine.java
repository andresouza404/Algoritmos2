package ComprasOnline;

public class ComprasOnLine {

	public static void main(String[] args) {
		Estoque estoque = new Estoque();
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		
		
		while (true) {
			Console.println("Qual produto deseja?");
			String escolha = Console.readString();
			
			if (escolha.equalsIgnoreCase("sair"))
				break;
			
			Produto produto = estoque.search(escolha);
			
			if (produto != null) {
				carrinho.addItem(escolha, produto);
			}
		}

		Console.println("Total da compra: " + carrinho.getTotal()
		);
	}

}
