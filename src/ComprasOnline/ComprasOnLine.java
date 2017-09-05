package ComprasOnline;

public class ComprasOnLine {

	public static void main(String[] args) {
		Produto livro1 = new Produto("Senhor dos Anéis", 120.00);
		Produto livro2 = new Produto("Algorithms", 427.00);
		Produto livro3 = new Produto("O Pequeno Príncipe", 10.00);
		
		double totalCompra = 0.0;
		Produto produto = null;
		
		while (true) {
			Console.println("Qual produto deseja?");
			String escolha = Console.readString();
			
			if (escolha.equalsIgnoreCase("sair"))
				break;
			
			switch (escolha) {
				case "senhor": produto = livro1; break;
				case "algorithms": produto = livro2; break;
				case "principe": produto = livro3; break;
			}
			
			totalCompra += produto.getPreco();
		}
		
		Console.println("Total da compra: " + totalCompra);
	}

}
