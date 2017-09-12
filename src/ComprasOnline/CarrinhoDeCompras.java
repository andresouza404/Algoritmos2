package ComprasOnline;

public class CarrinhoDeCompras {
	private ItemSelecionado[] items = new ItemSelecionado[10];
	
	public void addItem(String id, Produto produto) {
		for (ItemSelecionado item : items) {
			if (item != null) {
			   if (item.isProduct(id)) {
				   item.add(1);
				   return;
			   }
			}
		}
		addItemToCart(id, produto);
	}

	public double getTotal() {
		double total = 0.0;
		for (ItemSelecionado item : items) {
			total += item.getValue();
		}		
		return total;
	}
	
	private void addItemToCart(String id, Produto produto) {
		// TODO Auto-generated method stub
		Console.println("Produto selecionado:");
		Console.println(produto);
	}
}
